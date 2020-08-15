package basic.exercise11;

import java.util.Scanner;

/**
 * Given a score, show if is any of INSUFICIENTE, SUFICIENTE, BIEN, NOTABLE, SOBRESALIENTE
 */
public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        System.out.println("Introduce a score");
        score = scanner.nextInt();
        switch (score) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("INSUFICIENTE");
                break;
            case 5:
                System.out.println("SUFICIENTE");
                break;
            case 6:
                System.out.println("BIEN");
                break;
            case 7:
            case 8:
                System.out.println("NOTABLE");
                break;
            case 9:
            case 10:
                System.out.println("SOBRESALIENTE");
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
}
