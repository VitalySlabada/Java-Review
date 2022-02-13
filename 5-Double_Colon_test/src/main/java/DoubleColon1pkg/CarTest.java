package DoubleColon1pkg;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {


        //Zero-argument
        //ex1
        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car::new;
        System.out.println(c2.get().getModel());

        //One Argument

        Function<Integer,Car> f1 =  model -> new Car(model);
        Car bmw = f1.apply(2009);
        System.out.println(bmw.getModel());

        Function<Integer,Car> f2 = Car::new;
        Car bmw2 = f2.apply(2015);
        System.out.println(bmw2.getModel());


        Function<Integer,Car> fun1 = (i)-> new Car(i);
        System.out.println(fun1.apply(777).getModel());


        // bifunctional
        //TODO: change object's model
        // input: car object and model
        // output: reference to the car object with changed model


        BiFunction<Integer,Car,Car> bifun1 = (i, car)-> {
            car.setModel(i);
            return car;
        };

        ArrayList<Car> carlist= new ArrayList<>();
        Car car5 = new Car("bmw",740);
        System.out.println(bifun1.apply(760,car5).toString());

        carlist.add(car5);


//static
//        System.out.println("test1");
//        Consumer<String> conMR = Car::test1;
//        conMR.accept("hi");

////instance
//        Consumer<String> conMR1 = new Car()::test1;
//        conMR1.accept("hi");

//        //Two Argument
//        BiFunction<String,Integer,Car> b1 = (make,model) -> new Car(make,model);
//        Car honda = b1.apply("Honda",2007);
//        System.out.println(honda.getMake() + " " + honda.getModel());
//
//        BiFunction<String,Integer,Car> b2 = Car::new;
//        Car nissan = b2.apply("Nissan",2001);
//        System.out.println(nissan.getMake() + " " + nissan.getModel());


        //

        Consumer<Car> ConsMR = (x)-> x.test1();
        ConsMR.accept(car5);

        Consumer<Car> ConsMR2 = Car::test1;
        ConsMR2.accept(car5);







    }
}






















