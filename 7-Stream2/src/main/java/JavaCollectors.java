import Homework_Dish.Dish;


import java.util.*;
import java.util.stream.Collectors;

import static Homework_Dish.DishData.getAll;


public class JavaCollectors {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,3,4,4,5,6);

        //toCollection(Supplier) is used to create collection using collector
        System.out.println("***********toCollection");
        List<Integer> numList = numbers.stream()
                .filter(p->p>2)
                .collect(Collectors.toCollection(ArrayList::new));     ///constructor call, customizable to list or to set etc
        System.out.println(numList);

        System.out.println("***********toCollection");
        Set<Integer> numList2 = numbers.stream()
                .filter(p->p>2)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numList2);

        System.out.println("***********toList");
        List<Integer> numList3 = numbers.stream()
                .filter(p->p>2)
                .collect(Collectors.toList());
        System.out.println(numList3);

        System.out.println("***********toSet");
        Set<Integer> numList4 = numbers.stream()
                .filter(p->p>2)
                .collect(Collectors.toSet());
        System.out.println(numList4);





        //toMap(Function, Function): returns a Collector interface that gathers the input data into a new map
        System.out.println("***********toMap");
        Map<String,Integer> map1 =
                getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println(map1);



        System.out.println("***********counting()");
        //counting() : returns a Collector that counts the number of the elements
        Long evenCount = numbers.stream()
                .filter(p->p%2==0)
                .collect(Collectors.counting());


        System.out.println("***********tointFunction");
        //summingInt(ToIntFunction) : returns a Collector that produces the sum of integer valued function 
        Integer sum = getAll().stream()
                .filter((p->p.getCalories()<1000))
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println("sum = " + sum);

        //averageingInt: returns the average of the integers passed values
        System.out.println("***********AveragingInt");
        Double ave = getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(ave);

        //joining(): used to join various elements of caharacter or string into a single string object
        System.out.println("############joining");
        List<String>courses = Arrays.asList("Java","JS","TV");
        String res5 = courses.stream()
                .collect(Collectors.joining());

        System.out.println(res5);

        //partitioningBy(): is used to partition a stream of objects( or set of elements) based on a given predicate
        Map<Boolean, List<Dish>> part = getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println("part = " + part);

//        //groupingBy: is used for grouping objects by some property and storing results in Map
//        Map<Type, List<Dish>> group = DishData.getAll().stream()
//                .collect(Collectors.groupingBy(Dish::getType));
//
//        System.out.println("group = " + group);

        //groupingBy() : is used for groping objects by some property and storing results in a map instance
//        System.out.println("********GROUPINGBY()***********");
//        Map<Type,List<Dish>> dishType = getAll().stream()
//                .collect(Collectors.groupingBy(Dish::getType));
//
//        System.out.println(dishType);

    }
}
