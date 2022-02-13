import java.util.Arrays;
import java.util.List;

public class StreamOperations {

    public static void main(String[] args) {

        //forEach method belongs to Iterable, not streams but works in a similar way, will be used as terminal
        List<Integer> myList = Arrays.asList(1,2,3,4,5,6,78,2);
        myList.forEach(System.out::println);

        System.out.println("filter");
        //Intermediate operations: filter - must be terminated (with forEach for example)
        myList.stream()
                .filter(p->p%2==0)
                .distinct()
                .forEach(System.out::println);


        //LIMIT
        System.out.println("limit");
        myList.stream().filter(p->p>3)
                .limit(1)
                .forEach(System.out::println);

        //SKIP - skips # of elements and shows the rest
        System.out.println("skip");
        myList.stream().filter(p->p>3)
                .skip(2)
                .forEach(System.out::println);

        System.out.println("myList = " + myList);


        //MAP - implements something on each element
        System.out.println("map");

        myList.stream().map(num->num*2)
                .filter(p->p%2==0)
                .forEach(System.out::println);

        List<String> words = Arrays.asList ("java","apple","honda","developer");
        words.stream().map(String::length)
                .forEach(System.out::println);






    }
}
