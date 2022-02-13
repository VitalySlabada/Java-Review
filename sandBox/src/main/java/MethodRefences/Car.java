package MethodRefences;


import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;

@Data
@Builder
public class Car {

    private String model;
    private String make;
    private int year;
    private Color color;




    static Integer countCars(ArrayList<Car> list){
        return list.size();
    }


    public void startTheCar (Car car){
        System.out.println("THe following car is started " + car.getYear() +" "+ car.getMake() +" " + car.getModel());
    }



}
