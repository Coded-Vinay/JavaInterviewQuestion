import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class firstNonRepeatingChar {

    public static void main(String[] args) {

        String input = "mynameisvinay";

        Map<Character,Integer> namemap = new HashMap<>();

        for(char ch : input.toCharArray()){
            namemap.put(ch,namemap.getOrDefault(ch,0)+1);}
            for(Map.Entry<Character, Integer> set : namemap.entrySet()){
             if(set.getValue()==1){
                 System.out.println( set.getKey() );
             break;
             }

            }
        }
    }


