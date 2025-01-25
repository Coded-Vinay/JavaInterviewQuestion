/*
TODO: Take String as input and Count number of vowels and Consonants in the string
 */

import java.util.Scanner;

public class countVowvelsandConsonant {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.nextLine();
        char ch;
        int vowels = 0, consonanats = 0;

        //handling edge case of space and Punctuation in string (This will make sure )
        input.replaceAll("[^a-zA-Z]+", "");

        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonanats++;
            }

        }
        System.out.println("There are " + vowels + " Volwels and " + consonanats + " Consonants in the string");
    }
}
