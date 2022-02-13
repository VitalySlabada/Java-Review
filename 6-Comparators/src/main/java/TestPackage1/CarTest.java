package TestPackage1;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

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
        System.out.println("hi");
        Function<Car,String> fun1 = Car::getMake;
        System.out.println(fun1.apply(list.get(4)));


        Predicate<Integer> pred =(p)-> p % 2 == 0;
        pred.test(13);


        BiConsumer<Integer,Integer> biCon = (x,y) -> System.out.println(x+y);
        biCon.accept(34,1);
    }

}


