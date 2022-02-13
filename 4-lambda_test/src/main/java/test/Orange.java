package test;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
@Builder
//Builder generates an @AllArgsConstructor unless there is another @Xconstructor
@Data
public class Orange {

    private int weight;
    private Color color;
}
