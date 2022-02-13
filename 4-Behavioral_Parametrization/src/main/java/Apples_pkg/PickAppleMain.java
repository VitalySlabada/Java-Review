package Apples_pkg;

import java.sql.SQLOutput;
import java.util.ArrayList;

class PickAppleMain {
    public static void main(String[] args) {
        Apples ap1 = new Apples(100,"green",1);
        Apples ap2 = new Apples(300,"black",2);
        Apples ap3 = new Apples(200,"green",3);

        ArrayList<Apples> appArr = new ArrayList<>();
        appArr.add(ap1);
        appArr.add(ap2);
        appArr.add(ap3);

        PickAppleMain pam = new PickAppleMain();

        System.out.println("BY color");
        pam.pick(new PickByColor(), appArr);
        System.out.println("by weight");
        pam.pick(new PickByWeight(), appArr);

    }

    private void pick(Pick picking, ArrayList<Apples> arr) {
        picking.pickApples(arr);

    }


}

