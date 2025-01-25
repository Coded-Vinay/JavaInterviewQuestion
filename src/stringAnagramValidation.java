import java.util.Arrays;

public class stringAnagramValidation {
    public static void main(String[] args) {

        // Remove spaces and convert to lowercase for case-insensitive comparison
        String str1 = "Listen";
        String str2 = "Silent";

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
        }

        // Convert strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort both character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);


        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
        }
    }}

