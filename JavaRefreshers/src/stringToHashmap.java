import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class stringToHashmap {
    public static void main(String[] args) {
        String str = "my name is vinay";

        String [] strarr = str.toLowerCase().split(" ");
        char[] chrarr = str.toCharArray();


        System.out.println(Arrays.toString(strarr));
        for(String s : strarr){
            Map<String, Integer> hasmap = new HashMap<>();
            hasmap.put(s,hasmap.getOrDefault(s,0)+1);
            System.out.println(hasmap);

            System.out.println(Arrays.toString(chrarr));
            for(char c : chrarr){
                Map<Character , Integer> chrmap = new HashMap<>();
                chrmap.put(c, chrmap.getOrDefault(c,0)+1);
                System.out.println(chrmap);
            }




        }
    }
}
