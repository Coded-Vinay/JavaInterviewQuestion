
/*
TODO: Program to validate if entered number is prime or not
Logic - prime numbers are defined as positive integers greater than 1 that have
exactly two distinct positive divisors: 1 and the number itself.
 */

import java.util.Scanner;

public class primeNumberValidation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number between");
        long number = sc.nextInt();
        int factor = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    factor++;
                }
        }
        if (factor <= 2) {
            System.out.println(number + " has " + factor + " factors hence it is a prime number");
        } else {

            System.out.println(number + " has " + factor + " factors hence it is not a prime number");
        }
    }
}
