import java.util.ArrayList;

public class stringDecompress {

    public static void main(String[] args) {


        String str = "a2b4c5";
        char[] ch = str.toCharArray();
        ArrayList<Character> CarrL = new ArrayList<>();
        ArrayList<Integer> IarrL = new ArrayList<>();
        for (char c : ch) {

            if (Character.isLetter(c)) {
                CarrL.add(c);
            } else if (Character.isDigit(c)) {
                IarrL.add(Character.getNumericValue(c));

            }
        }
        System.out.println(CarrL);
        System.out.println(IarrL);

        for (int i = 0; i <= CarrL.size() - 1; i++) {
            int rep = IarrL.get(i);
            for (int j = 1; j <= rep; j++) {
                System.out.print(CarrL.get(i));
            }
        }
    }
}
