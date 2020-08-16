package exercises.basic.exercise5;

import java.util.Scanner;

/**
 * Given a number check if is divisible by two
 */
public class Exercise5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce a number");
        int number = scanner.nextInt();

        //We check if number is divisible by 2 and rest is zero
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is divisible by 2");
        } else {
            System.out.println("The number " + number + " not is divisible by 2");
        }
    }
}
