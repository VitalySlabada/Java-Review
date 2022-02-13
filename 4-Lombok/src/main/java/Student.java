

import lombok.*;

import java.util.Objects;

//@RequiredArgsConstructor  -- for FInal fields
@NoArgsConstructor//(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Data
// same as @Data
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
//@Builder
public class Student {

    private String firstName;
    private String lastName;
    private String userName;
    private String password;

    //private final int age;


}
