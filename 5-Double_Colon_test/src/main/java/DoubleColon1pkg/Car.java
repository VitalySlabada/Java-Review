package DoubleColon1pkg;

import lombok.Builder;
import lombok.Data;


@Data

public class Car {

    private String make;
    private int model;

    public Car(){

    }

    public Car(int model) {
        this.model = model;
    }

    public Car(String make, int model) {
        this.make = make;
        this.model = model;
    }

//     void test1 (String str){
//        System.out.println(str);
//    }

    public void setModel(Integer model) {
        this.model = model;
    }


    public void test1() {
        System.out.println(getModel() + " started");

    }
}
















