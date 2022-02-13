package Behavioral_parameterizationPractice;

import java.util.ArrayList;

public class CarTest {
    public static void main(String[] args) {

        ArrayList<Car> list = new ArrayList<>();
        list.add(Car.builder().year(1984).make("Oldsmobile").model("88").color(Color.SILVER).build());
        list.add(Car.builder().year(1990).make("Mitsubishi").model("Eclipse").color(Color.BLUE).build());
        list.add(Car.builder().year(1987).make("BMW").model("325e").color(Color.BLUE).build());
        list.add(Car.builder().year(1993).make("BMW").model("325i").color(Color.BLACK).build());
        list.add(Car.builder().year(1998).make("BMW").model("740i").color(Color.BLACK).build());
        list.add(Car.builder().year(2001).make("BMW").model("740i").color(Color.SILVER).build());
        list.add(Car.builder().year(2002).make("BMW").model("325ix").color(Color.BLACK).build());
        list.add(Car.builder().year(2003).make("Infiniti").model("i35").color(Color.BLACK).build());
        list.add(Car.builder().year(2010).make("BMW").model("325i").color(Color.BLUE).build());
        list.add(Car.builder().year(2011).make("SUBARU").model("OUTBACK").color(Color.SILVER).build());
        list.add(Car.builder().year(2016).make("HONDA").model("CIVIC").color(Color.BLUE).build());
        list.add(Car.builder().year(2016).make("SUBARU").model("OUTBACK").color(Color.BLUE).build());

        System.out.println("###############Printing all blue cars##############");
        printCarsM(list,new PrintAllBlue());
        System.out.println("\n\n###############Printing all old cars##############");
        printCarsM(list,new PrintAllOld());
    }

    private static void printCarsM(ArrayList<Car> list, PrintCarInterface print) {
        print.printCar(list);
    }

}
