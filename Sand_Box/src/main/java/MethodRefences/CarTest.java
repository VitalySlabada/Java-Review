package MethodRefences;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;

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


        Function<ArrayList<Car>, Integer> carsAmount = Car::countCars;
        printStatement(list,carsAmount);


        // try with instance


        Consumer<Car> startCar = list.get(1)::startTheCar;
        startCar.accept(list.get(10));


        Consumer<Car> startCar2 =      new Car("1","a",21, Color.BLACK)::startTheCar ;
        startACar(list.get(1),startCar2);


    }

    private static void startACar(Car car, Consumer<Car> startCar2) {
        startCar2.accept(car);
        System.out.println("and it will run for 15 minutes");
    }


    private static void printStatement(ArrayList<Car> list, Function<ArrayList<Car>, Integer> carsAmount) {
        System.out.println(carsAmount.apply(list));
    }



}
