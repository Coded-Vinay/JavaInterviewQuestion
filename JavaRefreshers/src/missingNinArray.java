public class missingNinArray {
    public static void main(String[] args) {

        int[] arr = { 2,3,4,5,7};
        int n = 6;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missing = expectedSum - actualSum;
        System.out.println("Missing number: " + missing);


    }

    }
