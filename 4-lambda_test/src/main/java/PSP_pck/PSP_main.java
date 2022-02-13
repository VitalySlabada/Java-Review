package PSP_pck;

public class PSP_main {
    public static void main(String[] args) {
        PSP psp = new PSP("Vitaly", 450.00);


//        selectPSPModel((PSP ob)-> {
//            return System.out.println("hi");
//        });

        //selectPSPModel(psp, new Tenant());
        selectPSPModel(psp, (PSP psp1)-> System.out.println("tenant"));
        //selectPSPModel(psp,());

    }

    private static void selectPSPModel(PSP obj1, ProcessPayment ppayment) {
        ppayment.processPaymentM(obj1);
    }
}
