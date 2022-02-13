package ComparatorPKG;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Apple {

    private int weight;
    private Color color;
}
