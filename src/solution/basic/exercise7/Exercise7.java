package solution.basic.exercise7;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] vowels = new char[5];
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';

        System.out.println("Introduce a text");
        String text = scanner.nextLine();

        int occurrencesCharacter = 0;
        //indexOf return the position when character is found. Returns -1 if not found
        for (int i = 0; i < vowels.length; i++) {
            int position = text.indexOf(vowels[i]);
            while (position != -1) {
                occurrencesCharacter++;
                position = text.indexOf(vowels[i], position + 1);
            }
        }

        System.out.println("The occurrences of vowels in text is: " + occurrencesCharacter);
    }
}
