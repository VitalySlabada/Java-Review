package FlatMapping;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


@Data
@AllArgsConstructor
public class Employee {

    private int empId;
    private String empName;
    private String empEmail;

    //this will have list of phone numbers for each person
    private List<String> empPhoneNumber;

}
