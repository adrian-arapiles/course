package exercises.basic.exercise15;

import java.util.Random;

/**
 * Create a table (array of array) with 4x4 size and show the sum of each column and row.
 */
public class Exercise15 {

    public static void main(String[] args) {
        int[][] table = new int[4][4];
        int[] rowsSum = new int[4];
        int[] columnsSum = new int[4];

        Random random = new Random();
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < table.length; i++) {
            System.out.print("[");
            //System.out.print(Arrays.toString(table[i]));
            for (int j = 0; j < table[i].length; j++) {
                rowsSum[i] += table[i][j];
                columnsSum[i] += table[j][i];
                System.out.print(table[i][j] + " ");
            }
            System.out.println("] = " + rowsSum[i]);
        }
        System.out.print("[");
        for (int i = 0; i < columnsSum.length; i++) {
            System.out.print(columnsSum[i] + " ");
        }
        System.out.println("]");

    }

}
