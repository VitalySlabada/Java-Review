import java.util.HashSet;
import java.util.Set;

public class SetReview {

    public static void main(String[] args) {
        //1.Create a set

        Set<Student> mySet = new HashSet<>();

        //2 add element

        mySet.add(new Student(5, "Pupkin"));
        mySet.add(new Student(6, "Bob"));
        mySet.add(new Student(7, "Ann"));

        System.out.println(mySet);


        Set<Integer> numSet = new HashSet<>();
        numSet.add(2);
        numSet.add(3);
        System.out.println(numSet);
        System.out.println(numSet.add(3)); // false - does not allow duplicates


        System.out.println(numSet);

        System.out.println(firstRepeatingCharacter("javadevel"));

    }

    //problem to solve first repeating element in a string
    public static Character firstRepeatingCharacter (String str) {



        Set<Character> charSet = new HashSet<>();

        for (Character each : str.toCharArray()) {
            if (charSet.add(each) == false) return each;
    }
            return null;

    }

}
