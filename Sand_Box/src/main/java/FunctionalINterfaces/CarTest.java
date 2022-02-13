package FunctionalINterfaces;

import java.sql.Array;
import java.util.ArrayList;
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

//############################################################
    /*TODO
       use functional interface to get list of new cars
     */
        Function<ArrayList<Car>,ArrayList<Car>> getListNewCars = (list1)-> {
            ArrayList<Car> newlist= new ArrayList<>();
            for (Car each:list1){
                if(each.getYear()>=2010) newlist.add(each);
            }
            return newlist;
        };

        ArrayList<Car> newList1 = provideCarList (list,getListNewCars);
        System.out.println(newList1);
//############################################################
// try to make it better by keeping list creation in function - predicate only for a condition

        Predicate<Car> carNew = (p)->p.getYear()>2010;
        ArrayList<Car> newList2 =getListWithPredicate(list,carNew);

        Predicate<Car> carOld = (p)->p.getYear()<2000;
        ArrayList<Car> listOld =getListWithPredicate(list,carOld);


        ArrayList<Car> listBlack =getListWithPredicate(list,(p)->p.getColor()==Color.BLACK);



        System.out.println("list blk " + listBlack);

        System.out.println("list old " + listOld);

        System.out.println("list new " + newList2);
    }



    //Method for fist way - long
    private static ArrayList<Car> provideCarList(ArrayList<Car> list, Function<ArrayList<Car>, ArrayList<Car>> getListNewCars) {
        return getListNewCars.apply(list);
    }

    //Method for second way - short
    private static ArrayList<Car> getListWithPredicate(ArrayList<Car> list, Predicate<Car> carNew) {
        ArrayList<Car> newCarlist = new ArrayList<>();
        for (Car each:list){

            if (carNew.test(each)) newCarlist.add(each);

        }return newCarlist;
    }

}
