package Homework;

import java.util.List;

public class WeightGrams implements PrintApple {
    @Override
    public void printApl(List<Apple1> list) {
        for (Apple1 each : list)
            System.out.println("An apple of " + each.weight + " grams.");
    }
}
