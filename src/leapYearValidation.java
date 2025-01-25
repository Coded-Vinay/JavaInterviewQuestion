import java.util.Scanner;

/*
TODO: Program to validate that year is leap year or not
A year is a leap year if it is divisible by 4, unless it is divisible by 100.
If the year is divisible by 100, it must also be divisible by 400 to be a leap year.
*/

public class leapYearValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        long year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " Year is a leap year");
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " Year is a leap yer");
        } else {
            System.out.println("Year is not a leap year");
        }
    }
}
