package n9_Optional;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1,2,4,78,6,9,4,7);

        //empty()
        Optional<String> emptyObj = Optional.empty();
        System.out.println(emptyObj.isPresent());
        System.out.println(Optional.of(numbers).isPresent());

        //ifPresent

        Optional<Integer> bigNums = numbers.stream().filter(x->x>100).findAny();
        bigNums.ifPresent(System.out::println);

        //get
        //System.out.println(bigNums.get());

        //orElse

        System.out.println(bigNums.orElse(555));


    }
}
