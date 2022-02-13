package Homework;

import java.util.List;

public class WeightColor implements PrintApple {
    @Override
    public void printApl(List<Apple1> list) {
        for (Apple1 each : list) {
            if (each.weight <= 100) System.out.print("A Light ");
            else System.out.print("A Heavy ");
            System.out.print(each.Color + " apple");
        }

    }
}

