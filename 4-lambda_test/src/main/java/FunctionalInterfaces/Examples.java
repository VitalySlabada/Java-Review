package FunctionalInterfaces;

import java.net.Inet4Address;
import java.util.function.*;

public class Examples {


    public static void main(String[] args) {
//##########anonymous way
//        Predicate<Integer> lesserThan = new Predicate<Integer>() {
//
//            @Override
//            public boolean test(Integer integer) {
//                return false;
//            }
//
//
//        };
//        lesserThan.test(50);
        
        //Predicate<Integer> lesserThan = implementation of test method
        Predicate<Integer> lessserThan =  (Integer a) ->a<18;
        System.out.println("lessserThan = " + lessserThan.test(50));


        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(56);



        //##########BiConsumer###############
        BiConsumer<Integer, Integer> addTwo  =  (x,y) -> System.out.println(x+y);
        addTwo.accept(100,200);

        //##########Function###############

        Function<String,String> fun = s->"Hello " +s;
        System.out.println(fun.apply("vasya"));


        //***********Supplier*******
        Supplier<Double> sup = ()-> 90.0;
        System.out.println(sup.get());
    }
}
