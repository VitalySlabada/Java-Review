

package Homework;

public class Apple1 {
    int weight;
    String Color;

    public Apple1(int weight, String color) {
        this.weight = weight;
        Color = color;
    }

    @Override
    public String toString() {
        return "Apple1{" +
                "weight=" + weight +
                ", Color='" + Color + '\'' +
                '}';
    }
}
