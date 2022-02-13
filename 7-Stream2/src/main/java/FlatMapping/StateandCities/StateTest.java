package FlatMapping.StateandCities;

import java.util.List;

public class StateTest {
    public static void main(String[] args) {

        StateData.getAll()
                .map(State::getCities)
                .flatMap(List::stream)
                .forEach(System.out::println);


        StateData.getAll()
                .flatMap(p->p.getCities().stream())
                .forEach(System.out::println);

    }
}
