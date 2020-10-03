package exercises.basic.exercise14;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given a array of n elements, ask a position to delete and move the left numbers.
 */
public class Exercise14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers;
        int[] numbersNew;

        System.out.println("Introduce the length of array");
        numbers = new int[scanner.nextInt()];
        numbersNew = new int[numbers.length - 1];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        System.out.println("Introduce the position to delete");
        int positionToDelete = scanner.nextInt();
        for (int i = positionToDelete; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        numbersNew = Arrays.copyOfRange(numbers, 0, numbersNew.length);
        System.out.println("The array now is: " + Arrays.toString(numbersNew));

    }
}
