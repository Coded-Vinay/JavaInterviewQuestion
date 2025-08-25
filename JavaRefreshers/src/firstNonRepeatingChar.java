import java.net.CookieHandler;
import java.util.*;

public class firstNonRepeatingChar {

    public static void main(String[] args) {

        String input = "mynameisvinay";

        Map<Character, Integer> namemap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            namemap.put(ch, namemap.getOrDefault(ch, 0) + 1);
        }
        System.out.println(namemap);
        ArrayList<Character> ac = new ArrayList<>();
        ArrayList<Character> bc = new ArrayList<>();
        StringBuilder rep = new StringBuilder();
        StringBuilder nonrep = new StringBuilder();



        for (Map.Entry<Character, Integer> set : namemap.entrySet()) {
            if (set.getValue() == 1) {
                bc.add(set.getKey());
                nonrep = nonrep.append(set.getKey()).append(" ");

            } else {
                ac.add(set.getKey());
                rep = rep.append(set.getKey()).append(" ");
            }
        }
        Collections.sort(bc);Collections.sort(ac);
        System.out.println("repeating char >>\s" + nonrep);
        System.out.println("non repeating char >>\s" + rep);


    }
}


