package solution.basic.exercise2;

/**
 * Show all numbers from 1 to 20 that are even
 *
 * PD. You can check exercise 5.
 */
public class Exercise2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

//        for (int i = 2; i <= 20; i += 2) {
//            System.out.println(i);
//        }
    }
}
