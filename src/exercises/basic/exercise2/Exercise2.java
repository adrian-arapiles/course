package exercises.basic.exercise2;

import java.util.Scanner;

/**
 * Given 2 numbers, indicate the major, the minor or if they are equals
 */
public class Exercise2 {

    public static void main(String[] args) {
        int number1 = 4;
        int number2 = 6;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce a number");
        number1 = scanner.nextInt();
        System.out.println("Introduce another number");
        number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("Number 1 is major than number2");
        }

        if (number1 < number2) {
            System.out.println("Number 2 is major than number1");
        }

        if (number1 == number2) {
            System.out.println("Number 1 and number2 are equals");
        }
    }
}
