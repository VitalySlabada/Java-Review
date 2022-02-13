package FunctionalInterfaces.OrangeFUN;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class OrangeTestClass {
    public static void main(String[] args) {


        ArrayList<Orange> inventory = new ArrayList<>();

        inventory.add(new Orange(300, Color.ORANGE));
        inventory.add(Orange.builder().weight(200).color(Color.ORANGE).build());
        inventory.add(Orange.builder().weight(111).color(Color.RED).build());
        inventory.add(Orange.builder().weight(333).build());

        Predicate<Orange> predicate = p -> p.getWeight()<=200;
        printOranges(inventory, predicate);


        printOranges(inventory, p-> true);

    }

    public static void printOranges (ArrayList<Orange> list, Predicate<Orange> p){
        for(Orange each : list){
            if(p.test(each)) System.out.println(each);
        }
    }
}