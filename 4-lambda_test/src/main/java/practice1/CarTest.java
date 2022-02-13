package practice1;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.function.*;

import static practice1.Color.BLACK;

public class CarTest {
    public static void main(String[] args) {

        ArrayList<Car> list = new ArrayList<>();
        list.add(Car.builder().year(1984).make("Oldsmobile").model("88").color(Color.SILVER).build());
        list.add(Car.builder().year(1990).make("Mitsubishi").model("Eclipse").color(Color.BLUE).build());
        list.add(Car.builder().year(1987).make("BMW").model("325e").color(Color.BLUE).build());
        list.add(Car.builder().year(1993).make("BMW").model("325i").color(BLACK).build());
        list.add(Car.builder().year(1998).make("BMW").model("740i").color(BLACK).build());
        list.add(Car.builder().year(2001).make("BMW").model("740i").color(Color.SILVER).build());
        list.add(Car.builder().year(2002).make("BMW").model("325ix").color(BLACK).build());
        list.add(Car.builder().year(2003).make("Infiniti").model("i35").color(BLACK).build());
        list.add(Car.builder().year(2010).make("BMW").model("325i").color(Color.BLUE).build());
        list.add(Car.builder().year(2011).make("SUBARU").model("OUTBACK").color(Color.SILVER).build());
        list.add(Car.builder().year(2016).make("HONDA").model("CIVIC").color(Color.BLUE).build());
        list.add(Car.builder().year(2016).make("SUBARU").model("OUTBACK").color(Color.BLUE).build());


        //PREDICATE
        Predicate<Car> predicateX = p->p.getYear()==2016;
        System.out.println(predicateX.test(list.get(0)));


        //PREDICATE IN FUNCTION SORT------sorting cars easy method
        sort(list, car -> car.getYear() < 2000);

        //Sorting by make
        System.out.println("############\nonly bmers:");
        sort(list, p -> p.getMake().equalsIgnoreCase("bmw"));

        //Sorting oneliner with predicate Function

        //Predicate<Car> sortPRED = (p)->p.getYear()<2000;
        Predicate<Car> sortPRED = (p)->p.getYear()>2000;

        System.out.println(sortPRED.test(list.get(0)));




        //Two in one out -> BiFunctional
        System.out.println("sort by color");
        BiFunction<ArrayList<Car>, Color, ArrayList<Car>> predicateCLR = (list1,  color)-> {
            ArrayList<Car> newList = new ArrayList<>();
            for (Car each : list1) { if (each.getColor() == color) newList.add(each);}
            return newList;
        };

        System.out.println(getColorCar (list, BLACK, predicateCLR));

        //-------Supplier no input one output

        Supplier<Double> supl = ()-> Math.random();
        //System.out.println(supl.get());
        System.out.println(SupM(supl));

        //------Consumer
        System.out.println("For consumer");
        Consumer <Integer> cons = i-> System.out.println(i) ;
        //consM(10, cons);
        //or short 1 line
        cons.accept(10001);



        //---------Function
        // takes list, retuns first car that is blue
        Function<ArrayList<Car>, Car> predFun2 = (lfun2)-> {
            for (Car each: lfun2){
                if (each.getColor()==Color.BLUE) return each;
            }
            return null;
        };

        System.out.println(predFun2.apply(list).toString());

    }


        //







    //For Predicate
    private static ArrayList<Car> getColorCar(ArrayList<Car> list, Color blk, BiFunction<ArrayList<Car>, Color, ArrayList<Car>> predicateCLR) {
        return predicateCLR.apply(list,blk);

    }
    // For BiFunctional
    static public void sort(ArrayList<Car> list, Predicate<Car> p){
            for (Car each: list ){
                if (p.test(each)) System.out.println(each);;
            }
        }

    //For Supplier
    public static Double SupM (Supplier<Double> supl){
        return supl.get();
    }
    //For Consumer
    public static void consM (Integer in, Consumer<Integer> cons){
        cons.accept(in);

    }




}
