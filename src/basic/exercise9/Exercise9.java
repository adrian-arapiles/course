package basic.exercise9;

import java.util.Scanner;

/**
 * Ask number until it is positive. (while and do while)
 */
public class Exercise9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Introduce a number. If it's negative, would ask you again");
            number = scanner.nextInt();
        } while (number < 0);

    }

}
