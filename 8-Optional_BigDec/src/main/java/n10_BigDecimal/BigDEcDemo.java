package n10_BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDEcDemo {

    public static void main(String[] args) {
        double  d1 = 147.14;
        double  d2 = 147.04;
        //does not return exact value
        System.out.println(d1-d2);


        ///have ti use the way  below
        BigDecimal b1 = new BigDecimal("147.12");
        BigDecimal b2 = new BigDecimal("147.02");
        System.out.println(b1.subtract(b2));


        //Scaling and Rounding

        BigDecimal number1 = new BigDecimal(23.12);

        System.out.println(number1.setScale(1, RoundingMode.CEILING));
        System.out.println(number1.setScale(2, RoundingMode.CEILING));

        System.out.println(number1.setScale(2, RoundingMode.FLOOR));
        System.out.println("comapring");
        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("2")));
        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("3")));


        //BigDecimals are immutable




    }
}
