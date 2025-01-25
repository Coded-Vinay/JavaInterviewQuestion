import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        str =str.replaceAll("[^a-zA-Z]+", "").toUpperCase();
        System.out.println(str);
      //          replaceAll("\\s","");
        char c;
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            rev = c + rev;
        }
        if (str.equalsIgnoreCase(rev)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome ");
        }
    }
}
