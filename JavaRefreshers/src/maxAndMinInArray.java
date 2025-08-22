import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class maxAndMinInArray {

    public static void main(String[] args) {

        int[] numarr = { 2,4,5,7,2,3,1};

        ArrayList<Integer> numarrr = new ArrayList<>();
                for(int i: numarr){
                    numarrr.add(i);
        }
Collections.sort(numarrr.reversed());
        System.out.println(numarrr);
        System.out.println("min\s" + numarrr.get(numarrr.size()-1) + "\n"  + "max\s" + numarrr.get(0));
    }
}
