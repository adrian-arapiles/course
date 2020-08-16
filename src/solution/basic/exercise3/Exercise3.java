package solution.basic.exercise3;

import java.util.Scanner;

/**
 * Calculate factorial of number given by console
 *
 * PD. Factorial is the product of all numbers from 1 to a number.
 */
public class Exercise3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce number to calculate factorial");
        int number = scanner.nextInt();
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println("The factorial of " + number + " is " + factorial);
    }
}
