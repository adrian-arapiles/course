package basic.exercise7;

import java.util.Scanner;

/**
 * Given a number, ask for as many numbers as introduce and sum them
 */
public class Exercise7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce how many numbers want to introduce");
        int nTimes = scanner.nextInt();
        int sum = 0;

        //Iterate as many times as introduced
        for (int i = 0; i < nTimes; i++) {
            System.out.println("Introduce a number");
            sum = sum + scanner.nextInt();
            //sum =+ scanner.nextInt();
        }

        System.out.println("The sum of all numbers is " + sum);
    }
}
