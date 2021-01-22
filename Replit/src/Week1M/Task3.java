package Week1M;

import java.util.Scanner;

/**
 * Change from a while loop to a do while loop
 * Created by: Melissa Melaugh
 * Created on: 18/01/2021
 * Updated on: 18/01/2021
 * COM742:Week1M.Task3
 */

public class Task3 {
    public static void main(String[] args) {
        totalNumbersWHILE();
    }

    /**
     * A method to get user input and total their numbers until they input a number less than or equal to 0
     */
    public static void totalNumbersWHILE() {
        //Initialise needed values
        int total = 0;
        int num;
        Scanner keyboard = new Scanner(System.in);

        do {
            // Get next input and add it to total
            System.out.println ("Enter number (0 to quit):");
            num = keyboard.nextInt();
            total += num;

            // Inform user of current total.
            System.out.println("Total is: " + total);
        } while (num > 0);
    }
}
