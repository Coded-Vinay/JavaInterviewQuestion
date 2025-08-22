import java.util.ArrayList;
import java.util.Collections;

public class checkArrayforDups {
    public static void main(String[] args) {
        int[] numarr = { 2,4,5,7,7,2,3,1};

        ArrayList<Integer> numarrr = new ArrayList<>();
        for(int i: numarr){
            numarrr.add(i);
        }
        Collections.sort(numarrr);
        for (int i = 0; i < numarrr.size() - 1; i++) {
            if (numarrr.get(i).equals(numarrr.get(i + 1))) {
                System.out.println(numarrr.get(i));
            }

        }

    }
}
