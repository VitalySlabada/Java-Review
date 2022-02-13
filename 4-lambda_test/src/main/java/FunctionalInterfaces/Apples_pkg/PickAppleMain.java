package FunctionalInterfaces.Apples_pkg;

import java.util.ArrayList;
import java.util.function.Predicate;

class PickAppleMain {
    public static void main(String[] args) {
        Apples ap1 = new Apples(1,100,",green");
        Apples ap2 = new Apples(3,100,"black");
        Apples ap3 = new Apples(2,300,"green");

        ArrayList<Apples> appArr = new ArrayList<>();
        appArr.add(ap1);
        appArr.add(ap2);
        appArr.add(ap3);

        //by color
        pick(appArr, p->p.color.equalsIgnoreCase("green"));

        //by weight
        System.out.println("by weight");
        pick(appArr, p->p.weight<200);


    }

    private static void pick(ArrayList<Apples> list, Predicate<Apples> p) {
        for (Apples each:list){
            if(p.test(each)){
                System.out.println(each.toString());
            }
        }

    }


}

