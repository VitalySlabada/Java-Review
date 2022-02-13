package Homework;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {

        List<Apple1> list = new ArrayList<>();
        list.add(new Apple1(56,"green" ));
        list.add(new Apple1(354,"red" ));
        list.add(new Apple1(210,"green" ));
        list.add(new Apple1(153,"red" ));

        //Using Behavioral parameterization
        print(list, new WeightColor());

        //USING Lambda
        print(list,((List<Apple1> list1) -> {
            for (Apple1 each : list1) {
                if (each.weight <= 100) System.out.print("A Light ");
                else System.out.print("A Heavy ");
                System.out.print(each.Color + " apple\n");
            }
        }
        ));


        //Using Behavioral parameterization
        print(list, new WeightGrams());

        //Using Lambda
//        print(list, (List<Apple1> list1) -> {
//            for (Apple1 each : list1) System.out.println("An apple of " + each.weight + " grams.");
//        });

    }

    static private void print(List<Apple1> list, PrintApple printing) {
        printing.printApl(list);
    }
}
