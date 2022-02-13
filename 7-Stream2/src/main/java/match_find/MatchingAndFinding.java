package match_find;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MatchingAndFinding {
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

        //ALL MAtch
        boolean isHealthy = menu.stream()
                .allMatch(dish->dish.getCalories()<1000);
        System.out.println(isHealthy);

        //Any mtach

        boolean isVeg= menu.stream().
                anyMatch(Dish::isVegetarian);
        System.out.println(isVeg);
        //Nonmatch

        System.out.println(menu.stream().noneMatch(p->p.getCalories()>10000));


        //Find any
        System.out.println("find any");
        Optional<Dish> dish = menu.stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish);

        //Find first
        System.out.println("find first");
        Optional<Dish> dish2 = menu.stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2);


        //count number of dishes usign map and reduce

        int dishcount = menu.stream().map(dish1->1).reduce(0, (a,b)->a+b);
        System.out.println("dishcount = " + dishcount);



    }
}
