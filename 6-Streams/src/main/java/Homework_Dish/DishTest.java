package Homework_Dish;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class DishTest {

    public static void main(String[] args) {

        List<Dish> menu = Arrays.asList(
                new Dish("pork",false,800,Type.MEAT),
                new Dish("beef",false,700,Type.MEAT),
                new Dish("chicken",false,400,Type.MEAT),
                new Dish("fries",true,530,Type.OTHER),
                new Dish("rice",true,350,Type.OTHER),
                new Dish("fruit",true,120,Type.OTHER),
                new Dish("pizza",true,550,Type.OTHER),
                new Dish("prawns",false,300,Type.FISH),
                new Dish("salmon",false,450,Type.FISH)
        );

        Stream<Dish> stream1 = menu.stream();
        // print less then 400
        stream1.filter(p->p.getCalories()<400).
                forEach(System.out::println);
        menu.stream()
                .map(Dish::getName)
                        .map(String::length)
                                .forEach(System.out::println);

        //
        menu.stream()
                .map(dish->
                {
                System.out.print(dish.getName()+" - " + dish.getName().length());
                return dish;
                })
                .limit(4)
                .forEach(each->System.out.println(""));

        //more practice - in class

        menu.stream().
                filter(dish->dish.getCalories()<400)
                .map(Dish::getName)
                .forEach(System.out::println);

        // print three high calorie dish name

        menu.stream()
                .filter(p->p.getCalories()>300)
                .limit(3)
                .forEach(System.out::println);
        System.out.println("************");
        menu.sort(Comparator.comparing(Dish::getCalories));
        menu.stream().sorted(Comparator.comparing(Dish::getCalories))
                .filter(p->p.getCalories()<400)
                //.map(Dish::getName)
                .forEach(p-> {
                        System.out.println(p.getName()+p.getCalories());
                });


    }
}
