package Behavioral_parameterizationPractice;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Car {

    private String model;
    private String make;
    private int year;
    private Color color;


}
