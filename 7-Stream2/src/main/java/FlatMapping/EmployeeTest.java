package FlatMapping;

import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        //Print all emails
        EmployeeData.readAll()
                .map(Employee::getEmpEmail).forEach(System.out::println);

        //Employee phone numbers

        EmployeeData.readAll().map(Employee::getEmpPhoneNumber)
                .forEach(System.out::println);

        // FLATMAPPING -> printing all phone numbers as one stream -> one-to-many

        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumber().stream())
                .forEach(System.out::println);
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumber)
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}
