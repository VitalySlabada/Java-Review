package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {


        ArrayList<User> list = new ArrayList<>();
        list.add(new User("John", "Smith", 37));
        list.add(new User("Bob", "Ericson", 27));
        list.add(new User("Vasya", "Pupkin", 47));
        list.add(User.builder().firstName("Mike").lastName("Echo").build());


        //Print all elements in the list
        printUsers(list, p -> true);
        System.out.println("starts with E");
        //PRint all user that last name starts with "e"
        printUsers(list,  p-> p.getLastName().startsWith("E"));



    }

    static void printUsers (ArrayList<User> list, Predicate<User> p){
        for (User each : list){
            if(p.test(each)){
                System.out.println(each.toString());
            }
        }

    }
}
