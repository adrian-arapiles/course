package solution.basic.exercise8;

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsNumber;
        double[] studentsScore;
        double score = 0;
        double sum = 0;
        double major = 0;
        double minor = 10;

        do {
            System.out.print("Introduce number of students: ");
            studentsNumber = scanner.nextInt();
        } while (studentsNumber <= 0); //While studentNumbers is < 0, we ask other time

        studentsScore = new double[studentsNumber];

        for (int i = 0; i < studentsScore.length; i++) {
            System.out.print("Score of student " + i + ": ");
            score = scanner.nextDouble();
            studentsScore[i] = score;
            sum += score; // sum score to accumulator for average
            if (score > major) {  // compare score with actual major and minor and update if change
                major = score;
            }
            if (score < minor) {
                minor = score;
            }
        }

        double average = sum / studentsNumber;
        System.out.printf("Average score: %.2f %n", average);
        System.out.println("The major score was " + major);
        System.out.println("The minor score was " + minor);

        for (int i = 0; i < studentsScore.length; i++) {
            if (studentsScore[i] > average) {
                System.out.println("Score introduced for student " + i + " was: " + studentsScore[i]);
            }
        }
    }
}
