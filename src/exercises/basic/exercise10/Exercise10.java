package exercises.basic.exercise10;

import java.util.Scanner;

/**
 * Ask number of students, then ask score of any of them and calculate the minor, major and average score.
 */
public class Exercise10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsNumber;
        double score = 0;
        double sum = 0;
        double major = 0;
        double minor = 10;

        do {
            System.out.print("Introduce number of students: ");
            studentsNumber = scanner.nextInt();
        } while (studentsNumber <= 0); //While studentNumbers is < 0, we ask other time

        for (int i = 1; i <= studentsNumber; i++) {
            System.out.print("Score of student " + i + ": ");
            score = scanner.nextDouble();
            sum += score; // sum score to accumulator for average
            if (score > major) {  // compare score with actual major and minor and update if change
                major = score;
            }
            if (score < minor) {
                minor = score;
            }
        }

        System.out.printf("Average score: %.2f %n", sum / studentsNumber);
        System.out.println("The major score was " + major);
        System.out.println("The minor score was " + minor);
    }
}
