package Behavioral_parameterizationPractice;

import java.util.ArrayList;

public class PrintAllBlue implements PrintCarInterface{

    @Override
    public void printCar(ArrayList<Car> list) {
        for(Car each: list) {
            if (each.getColor()==Color.BLUE) System.out.println(each);
        }
    }
}
