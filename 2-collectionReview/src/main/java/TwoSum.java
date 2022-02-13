import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public static void main(String[] args) {
    int[] myArray = {2,10,9,13};
        System.out.println(Arrays.toString(twoSum1(myArray, 9)));

        System.out.println(Arrays.toString(twoSumOptimal(myArray, 9)));

    }
    public static int[] twoSum1(int [] arr1, int target){
        for (int i =0 ; i <arr1.length; i++){
            for (int j = i+1; j< arr1.length;j++){
                if ((arr1[i]+arr1[j]==target)) return new int[]{i,j};
            }

        }
        return arr1;
    }

    public static int[] twoSumOptimal (int [] arr1, int target){
        //Create hash map
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i<arr1.length; i++){
            map.put(arr1[i], i);
            int match = target - arr1[i];
            if(map.containsKey(match)) return new int []{i, map.get(match)};
        }



        return null;

    }

}
