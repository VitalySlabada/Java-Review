package Apples_pkg;

import java.util.ArrayList;

public class PickByWeight implements Pick {

    @Override
    public void pickApples(ArrayList<Apples> list) {
        for (Apples each: list){
            if (each.weight>200) System.out.println(each.id);
        }

    }
}
