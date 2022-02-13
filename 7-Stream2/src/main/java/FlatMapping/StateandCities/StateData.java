package FlatMapping.StateandCities;

import java.util.Arrays;
import java.util.stream.Stream;

public class StateData {

    static public Stream<State> getAll (){
        return Stream.of(
                new State("Illinois", Arrays.asList("Chicago","Joliet", "Springfield")),
                new State("Florida", Arrays.asList("Tampa","Naples", "Orlando"))
        );
    }
}
