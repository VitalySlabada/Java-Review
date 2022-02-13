package Reducing;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(12,3,4,5);
        int result = numbers.stream().reduce(10,(a,b)->a+b);
        System.out.println("result = " + result);

        Optional result2 = numbers.stream().reduce((a, b)->a+b);
        System.out.println("result2 = " + result2);

        //maxand min

        Optional<Integer> min =  numbers.stream().reduce(Integer::min);

        Optional<Integer> max =  numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("sum = " + sum);





    }
}
