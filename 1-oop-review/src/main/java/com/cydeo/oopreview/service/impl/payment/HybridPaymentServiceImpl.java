package com.cydeo.oopreview.service.impl.payment;


import com.cydeo.oopreview.enums.ServiceProvider;
import com.cydeo.oopreview.model.payment.PaymentResponse;
import com.cydeo.oopreview.model.payment.AuthRequest;
import com.cydeo.oopreview.model.payment.Payment;
import com.cydeo.oopreview.model.pos.Pos;
import com.cydeo.oopreview.model.pos.PosClientRequest;
import com.cydeo.oopreview.model.pos.PosClientResponse;
import com.cydeo.oopreview.posclient.AbstractPosClient;
import com.cydeo.oopreview.posclient.client.BankAPosClient;
import com.cydeo.oopreview.posclient.client.BankBPosClient;
import com.cydeo.oopreview.posclient.client.BankCPosClient;
import com.cydeo.oopreview.service.PaymentService;
import com.cydeo.oopreview.service.PosSelectionService;
import com.cydeo.oopreview.service.impl.initialization.HybridPosInitializationServiceImpl;
import com.cydeo.oopreview.service.impl.initialization.TenantPosInitializationServiceImpl;
import com.cydeo.oopreview.service.impl.selection.HybridPosSelectionServiceImpl;
import com.cydeo.oopreview.service.impl.selection.TenantPosSelectionServiceImpl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

import static com.cydeo.oopreview.constant.StaticConstants.HYBRID_MERCHANT_PAYMENT_LIST;


public class HybridPaymentServiceImpl implements PaymentService {

    @Override
    public PaymentResponse auth(AuthRequest authRequest) {
        PaymentResponse paymentResponse = new PaymentResponse();

        PosSelectionService posSelectionService = new HybridPosSelectionServiceImpl();

        Pos pos = posSelectionService.decidePaymentPos(authRequest);
        String recipient = "Recipient";

        AbstractPosClient abstractPosClient;

        PosClientRequest posClientRequest = new PosClientRequest(authRequest.getAmount(),
                pos.getName(),
                recipient);

        abstractPosClient = decidePosClient(pos.getName());

        UUID orderId = abstractPosClient.generateOrderId();
        posClientRequest.setOrderId(orderId.toString());

        PosClientResponse posClientResponse = abstractPosClient.auth(posClientRequest);

        paymentResponse.setResult(posClientResponse.getResult());
        paymentResponse.setErrorCde(posClientResponse.getErrorCde());

        paymentResponse.setPaymentCostAmount(
                calculateCommissionAmountForHybridMerchant(authRequest.getServiceProvider()));

        if (paymentResponse.getResult() == 1) {
            initHybridMerchantPayment(authRequest, orderId);
        }

        return paymentResponse;
    }


    @Override
    public PaymentResponse auth3D(AuthRequest auth3DRequest) {
        PaymentResponse paymentResponse = new PaymentResponse();

        PosSelectionService posSelectionService = new HybridPosSelectionServiceImpl();

        Pos pos = posSelectionService.decidePaymentPos(auth3DRequest);
        String recipient = "Recipient";

        AbstractPosClient abstractPosClient;

        PosClientRequest posClientRequest = new PosClientRequest(auth3DRequest.getAmount(),
                pos.getName(),
                recipient);

        abstractPosClient = decidePosClient(pos.getName());

        UUID orderId = abstractPosClient.generateOrderId();
        posClientRequest.setOrderId(orderId.toString());

        PosClientResponse posClientResponse = abstractPosClient.auth3D(posClientRequest);

        paymentResponse.setResult(posClientResponse.getResult());
        paymentResponse.setErrorCde(posClientResponse.getErrorCde());

        paymentResponse.setPaymentCostAmount(
                calculateCommissionAmountForHybridMerchant(auth3DRequest.getServiceProvider()));

        if (paymentResponse.getResult() == 1) {
            initHybridMerchantPayment(auth3DRequest, orderId);
        }

        return paymentResponse;
    }

    // cost calculation showing how much will be charged for successful payments from stores
    public BigDecimal calculateCommissionAmountForHybridMerchant(ServiceProvider serviceProvider) {
        switch (serviceProvider) {
            case AMEX:
                return BigDecimal.TEN;
            case VISA:
                return new BigDecimal("0.2");
            case MASTER_CARD:
                return new BigDecimal("0.3");
            default:
                return BigDecimal.ZERO;
        }
    }

    // after succesfull payment, payments need to be collected into payment list
    private void initHybridMerchantPayment(AuthRequest authRequest, UUID orderId) {
        Payment payment = new Payment(new Date(), authRequest.getAmount(), orderId, authRequest.getAmount());
        HYBRID_MERCHANT_PAYMENT_LIST.add(payment);
    }

    //determines which bank the payments are directed to
    public AbstractPosClient decidePosClient(String posName) {
        switch (posName) {
            case "BANKA":
                return new BankAPosClient();
            case "BANKB":
                return new BankBPosClient();
            case "BANKC":
                return new BankCPosClient();
            default:
                return null;
        }
    }
}
