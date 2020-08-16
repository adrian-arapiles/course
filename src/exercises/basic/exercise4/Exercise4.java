package exercises.basic.exercise4;

import java.util.Scanner;

/**
 * Given a radio calculate area of a circle
 */
public class Exercise4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce a radio");
        double radio = scanner.nextDouble();

        //We apply formula to calculate the area of circle
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("The area of circle is " + area);

    }
}
