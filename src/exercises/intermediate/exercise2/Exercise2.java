package exercises.intermediate.exercise2;

import java.util.Scanner;

/**
 * We want to print name introduce by console and then the name reversed. We show that a method can return a variable.
 */
public class Exercise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String name = scanner.nextLine();
        System.out.println("Your name is "+ name);
        System.out.println("Your name reversed is " + reverseName(name));
    }

    public static String reverseName(String name) {
        return new StringBuilder(name).reverse().toString();
    }


}
