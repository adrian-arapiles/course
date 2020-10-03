package exercises.intermediate.exercise3;

import java.util.Scanner;

/**
 * We want to count the number of words, characters and number of character on a sentence given by console.
 */
public class Exercise3 {

//    String sentence;
//    char character;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write character to search:");
        char character = scanner.nextLine().charAt(0);
        System.out.println("Write a sentence to count words, character and occurrences of " + character + ":");
        String sentence = scanner.nextLine();
        System.out.println("Your sentence is: " + sentence);
        System.out.println("Number of words: " + countWords(sentence));
        System.out.println("Number of characters: " + countCharacters(sentence));
        System.out.println("Number of character '" + character +"':" + countCharacter(sentence, character));
//        executeCounts(sentence);
    }

    public static void executeCounts(String sentence, char character) {
        System.out.println("Your sentence is: " + sentence);
        System.out.println("Number of words: " + countWords(sentence));
        System.out.println("Number of characters: " + countCharacters(sentence));
        System.out.println("Number of character '" + character +"': " + countCharacter(sentence, character));
    }


    /**
     * We count number of spaces character and return spaces count + 1, the number of words.
     * @param sentence sentence to count words
     * @return number of words
     */
    public static int countWords(String sentence) {
        char someChar = ' ';
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == someChar) {
                count++;
            }
        }

//        count = countCharacters(sentence);

        return count + 1;
    }

    /**
     * We count the number of characters
     * @param sentence sentence to count character
     * @return length of sentence
     */
    public static int countCharacters(String sentence) {
        return sentence.length();
    }

    /**
     * We count the number of character given
     * @param sentence sentence to count character given
     * @param character character to count
     * @return number of occurrences of character given
     */
    public static int countCharacter(String sentence, char character) {
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }

}
