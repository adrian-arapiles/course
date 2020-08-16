package solution.basic.exercise1;

import java.util.Scanner;

/**
 * Ask two numbers, the height and base of rectangle, then calculate the area
 *
 * PD. The formula is base * height. You can check exercise 4.
 */
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce a base of rectangle");
        double base = scanner.nextDouble();
        System.out.println("Introduce a height of rectangle");
        double height = scanner.nextDouble();

        System.out.println("The area of rectangle is: " + base * height);
    }
}
