package FlatMapping.StateandCities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor

public class State {
        private String stateName;
        private List<String> cities = new ArrayList<>();

        public void addCity(String city){
            cities.add(city);
        }
        public List<String> getCities(){
            return this.cities;
        }
    }


