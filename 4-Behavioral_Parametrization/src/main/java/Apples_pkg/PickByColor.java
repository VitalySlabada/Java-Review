package Apples_pkg;

import java.util.ArrayList;

public class PickByColor implements Pick {

    @Override
    public void pickApples(ArrayList<Apples> list) {
        for ( Apples each: list ){
            if (each.color.equalsIgnoreCase("green")) System.out.println(each.id);
        }

    }
}
