package LambdaPractice;

import java.util.ArrayList;

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

    /*
     describes a function to use for Lambda
     public ArrayList() print(ArrayList<Car> cars){
            new Arr List
            for (Car each:cars)
            if blue add to list
            return list
    }*/

       PrintSomeCarsInterface printBlue = (list1)-> {
        ArrayList<Car> newList = new ArrayList<>();
        for (Car each:list1){ if (each.getColor()==Color.BLUE) newList.add(each); }
        return newList;
        };



       getCarList(list, printBlue);
       // ooooooor directly
        System.out.println(printBlue.printCars(list));



    /*
     Get new list of old cars
    }*/
        PrintSomeCarsInterface printOld = (list2)->{
            ArrayList<Car> newList = new ArrayList<>();
            for (Car each:list2){ if (each.getYear()<=2000) newList.add(each); }
            return newList;
        };


        ArrayList<Car> listOld = printOld.printCars(list);
        System.out.println(listOld);


    }

    private static void getCarList(ArrayList<Car> list, PrintSomeCarsInterface printBlue) {
        printBlue.printCars(list);
    }


}
