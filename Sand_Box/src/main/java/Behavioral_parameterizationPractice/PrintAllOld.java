package Behavioral_parameterizationPractice;

import java.util.ArrayList;

public class PrintAllOld implements PrintCarInterface {


    @Override
    public void printCar(ArrayList<Car> list) {
        for (Car each : list) {
            if (each.getYear()<=2000) System.out.println(each);
        }
    }
}