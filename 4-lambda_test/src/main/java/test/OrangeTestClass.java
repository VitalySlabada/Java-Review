package test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class OrangeTestClass {
    public static void main(String[] args) {


        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(300, Color.ORANGE));

        inventory.add(Orange.builder().weight(200).color(Color.ORANGE).build());
        inventory.add(Orange.builder().weight(111).color(Color.RED).build());
        inventory.add(Orange.builder().weight(333).build());




        //OrangeFormatter simpleFormatter = (Orange orange) -> "an orange of " + orange.getWeight();
        OrangeFormatter simpleFormatter = orange -> "an orange of " + orange.getWeight();
        //prettyPrintApple(inventory,simpleFormatter);

//        OrangeFormatter fancyFormatter = orange -> {
//            String characteristic = orange.getWeight()>150?"Heavy":"Light";
//            return "A " + characteristic + " " +orange.getColor() + " orange";
//        };
//
//
//        prettyPrintApple(inventory,fancyFormatter);

        Function<Orange, String> fun  = orange -> {
            String characteristic = orange.getWeight()>150?"Heavy":"Light";
            return "A " + characteristic + " " +orange.getColor() + " orange";
        };

        prettyPrintApple(inventory, fun);
    }

    private static void prettyPrintApple(List<Orange> inventory, Function<Orange, String> fun){
        for (Orange each: inventory){
            String output= fun.apply(each);
            //String output = orangeFormatter.accept(each);
            System.out.println(output);
        }

    }


}
