package Sort_pkg;

public class ArraySorting {

    public static void main(String[] args) {

        //ArraySorting as = new ArraySorting();

        //as.sort(new BubbleSort());

       //  Pass the type of sort by passing objects - bubble or quick
        sort(new BubbleSort());


        // using lambda sort(()->System.out.println("bubblesort"));


    }


//Accepts interface Sorting- abstract sort - can be bubble or quick
     static private void sort(Sorting sortType) {
        sortType.sort();
    }
}
