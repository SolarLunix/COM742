package Week1M;

import java.util.Scanner;

/**
 * A simple program to check if an input character is a Vowel or Consonant using Switch Case
 * Created by: Melissa Melaugh
 * Created on: 18/01/2021
 * Updated on: 18/01/2021
 * COM742:Week1M.Task2
 */

class Task2 { // Main {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // Test the method
        //checkVowel('a');
        //checkVowel('b');

        // Get user input and check if it's a vowel or not
        char letter = getNextChar("What letter would you like to check?");
        checkVowel(letter);
    }

    /**
     * This method checks if a character is a vowel or not and prints it to screen
     * @param letter the character to check
     */
    private static void checkVowel(char letter){
        switch(letter){
            // if vowel print out that the letter is a vowel
            case 'A': case 'a':
            case 'E': case 'e':
            case 'I': case 'i':
            case 'O': case 'o':
            case 'U': case 'u':
                System.out.println(String.format("%s is a vowel", letter));
                break;
            // if it's not a vowel, print out the letter is not a vowel
            default:
                System.out.println(String.format("%s is not a vowel", letter));
        }
    }

    /**
     * A method to get the next character from a user
     * @param reqest a string to be printed out to the user
     * @return char - the character the user inputs
     */
    private static char getNextChar(String reqest){
        String nextString; // initialise the string
        System.out.println(reqest); // print out the request
        nextString = in.nextLine(); // get the next line
        return nextString.charAt(0); // return the first character from the line
    }
}