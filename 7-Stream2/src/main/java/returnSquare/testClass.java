package returnSquare;

import java.util.stream.Stream;

public class testClass {
    public static void main(String[] args) {

        Stream.of(1,2,3,4,5,6).map(each->each*each).forEach(System.out::println);

        //or
        Stream<Integer> str  = Stream.of(1,2,3,3,5,6,7,8,9,0);
        str.map(p->p*p).forEach(System.out::println);


    }
}
