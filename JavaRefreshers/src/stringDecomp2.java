import java.util.ArrayList;

public class stringDecomp2 {

    public static void main(String[] args) {

        String inp = "a4b6c11";
        ArrayList<Character> arrlC = new ArrayList<>();
        ArrayList<Integer> arrlI = new ArrayList<>();



        for(int i = 0 ; i< inp.length(); ){
            char c = inp.charAt(i++);
            arrlC.add(c);
            StringBuilder n = new StringBuilder();

            while(i<inp.length() && Character.isDigit(inp.charAt(i))) {
                n.append(inp.charAt(i++));
            }
            arrlI.add(Integer.parseInt(n.toString()));
            }

        for ( int i = 0 ; i<arrlC.size(); i++){
            int rep = arrlI.get(i);
            for(int j = 1 ; j<=rep ; j++){
                System.out.print(arrlC.get(i));
            }}

        }
    }

