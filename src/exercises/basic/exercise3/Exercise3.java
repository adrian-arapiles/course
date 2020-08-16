package exercises.basic.exercise3;

import java.util.Scanner;

/**
 * Introduce your name and show a greeting
 */
public class Exercise3 {

    public static void main(String[] args) {

        // Scanner is a helper class to get things from console (introduce parameters for example)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your name");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
    }
}
