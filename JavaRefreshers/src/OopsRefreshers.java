import java.util.HashSet;
import java.util.Scanner;

public class OopsRefreshers {

    public static void main(String[] args) {

        char[] charArr = {'a', 'b', 'c'};
        HashSet<Character> hasset = new HashSet<>();
        for (char c : charArr) {
            hasset.add(c);
        }
        int size = hasset.size();
        System.out.println(size);
    }
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();


}
