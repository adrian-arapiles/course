package exercises.intermediate.exercise1;

/**
 * We have 2 array of number and we want to print them. We show how to print 1, 2 or N arrays only with 1 method, reusing same code.
 * In this case, method do something, but return nothing (void)
 */
public class Exercise1 {

    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 3, 4, 5};
        int[] numbers2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number: " + numbers[i]);
        }

        System.out.println();

        for (int i = 0; i < numbers2.length; i++) {
            System.out.println("Number: " + numbers2[i]);
        }

//        printArray(numbers);
//        printArray(numbers2);

    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Number: " + array[i]);
        }
        System.out.println();
    }
}
