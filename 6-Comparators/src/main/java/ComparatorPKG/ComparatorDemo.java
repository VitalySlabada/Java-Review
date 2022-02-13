package ComparatorPKG;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class ComparatorDemo {
    public static void main(String[] args) {


        List<Integer> list1 = Arrays.asList(10, 0, 15, 5, 20);

        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

        //Descending

        Collections.sort(list1, new MyComparator());
        System.out.println(list1);

        Collections.sort((list1), ((o1,o2)-> (o1>o2)  ? -1 : (o2<o1) ? 1 : 0));


        //Ascending

        list1.sort((o1,o2)->o1.compareTo(o2));
        System.out.println(list1);

        //Descending
        list1.sort((o2,o1)-> o1.compareTo(o2));
        System.out.println(list1);

//Apples using comparing

        List<Apple> myInventory = Arrays.asList(
                new Apple(80,Color.GREEN),
                new Apple(155,Color.RED),
                new Apple(120,Color.GREEN)
        );
//
        Comparator<Apple>sortApple = comparing((Apple apple)->apple.getWeight());
        myInventory.sort(sortApple);
        System.out.println("myInventory = " + myInventory);
//short way

        myInventory.sort(comparing((apple)->apple.getWeight()));
        System.out.println("myInventory = " + myInventory);


// even shorter
        myInventory.sort(comparing(Apple::getWeight));
        System.out.println("myInventory = " + myInventory);

//to reverse

        myInventory.sort(comparing(Apple::getWeight).reversed());


        //chaininng
        myInventory.sort(comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));
        System.out.println(myInventory);

    }
}
