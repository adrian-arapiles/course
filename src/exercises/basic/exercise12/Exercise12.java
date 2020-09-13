package exercises.basic.exercise12;

import java.util.Scanner;

/**
 * Count the number of characters of String given by console
 * Also count the number of occurrences of character 'a'
 */
public class Exercise12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char character = 'a';
        System.out.println("Introduce a text");
        String text = scanner.nextLine();
        System.out.println("The length of text is: " + text.trim().length());

        int occurrencesCharacter = 0;
        //indexOf return the position when character is found. Returns -1 if not found
        int position = text.indexOf(character);
        while (position != -1) {
            occurrencesCharacter++;
            position = text.indexOf(character, position + 1);
        }
        System.out.println("The occurrences of character 'a' in text is: " + occurrencesCharacter);
    }
}
