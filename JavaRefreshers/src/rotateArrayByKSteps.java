import java.util.Arrays;

public class rotateArrayByKSteps {

    public static void main(String[] args) {
        int[] number = {2, 3, 4, 5, 6};

        for (int k = 1; k <= 3; k++) {

            int temp = number[0];
            int j;
            for (j = 0; j <= number.length - 2; j++) {
                number[j] = number[j + 1];
            }
            number[j] = temp;
            System.out.println("Array after " + k  + "\s Rotation " +Arrays.toString(number));
        }
    }
}

