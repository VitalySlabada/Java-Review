import java.util.HashMap;
import java.util.Map;

public class MapReview {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"vitaly");
        map.put(2,"john");

        System.out.println(map.get(2));
        System.out.println(firstNonRepeatingChar("cydeoascyddlekfjasdlkfja;l"));

    }

    public static Character firstNonRepeatingChar(String str){
        Map<Character, Integer> nameHM = new HashMap<>();
        int count;

        for (Character each: str.toCharArray()){
            if (nameHM.containsKey(each)) {
                count = nameHM.get(each);
                nameHM.put(each,count+1);
            }else nameHM.put(each,1);

        }

        for (Character ch:str.toCharArray()){
            if(nameHM.get(ch)==1) return ch;
        }
        return Character.MIN_VALUE;
    }
}
