import java.util.HashSet;
import java.util.Set;

public class checkDupsUsingSet {

    public static void main(String[] args) {

        int[] arr = {3, 5, 1, 4, 2, 5}; // 5 is duplicated

        Set<Integer> seen = new HashSet<>();
        boolean Duplicates = false;

        for (int num : arr) {
            if (!seen.add(num)) {
                Duplicates = true;
                System.out.println("Duplicate found: " + num);
            }
        }

        if (!Duplicates) {
            System.out.println("No duplicates found.");
        }

    }
}
