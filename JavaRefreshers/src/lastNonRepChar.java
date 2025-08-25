import java.util.HashMap;

public class lastNonRepChar {

    public static void main(String[] args) {

        String input= "mynameisvinayk";

        char[] carr = input.toCharArray();

        HashMap<Character, Integer> charMap = new HashMap<>();
        for(char c : carr){
          charMap.put(c, charMap.getOrDefault(c,0)+1  );
        }
      int size =   charMap.size();
        System.out.println(size);
        System.out.println(charMap);
       for(int j = input.length()-1 ; j>=0 ; j--){
           if(charMap.get(input.charAt(j)) == 1){
               System.out.println(input.charAt(j));
break;
            }

        }
    }
}
