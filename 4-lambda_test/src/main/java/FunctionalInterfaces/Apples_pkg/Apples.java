package FunctionalInterfaces.Apples_pkg;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Apples {
    int id;
    int weight;
    String color;


}