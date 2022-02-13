package FlatMapping;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll() {
        return Stream.of(
                new Employee(100, "Mike", "Mike@gmail.com", Arrays.asList("1112223333", "11123654798")),
                new Employee(101, "BoB", "Bob@gmail.com", Arrays.asList("1112223333", "11123654798")),
                new Employee(102, "Jane", "Jane@gmail.com", Arrays.asList("1112223333", "11123654798"))
        );
    }
}