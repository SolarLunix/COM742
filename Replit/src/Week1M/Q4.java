package Week1M;

import java.util.Scanner;

/**
 * Calculates the sum of a range of numbers which are entered at the console by the user
 * Created by: Melissa Melaugh
 * Created on: 18/01/2021
 * Updated on: 18/01/2021
 * COM742:Week1M:Q4
 */
public class Q4 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int stop = 0;
        int val1;
        int val2;

        System.out.println("This program sums all of the numbers between two values.");

        do{
            val1 = getNextInt("Please enter the first (lower) number:");
            val2 = getNextInt("Please enter the second (higher) number:");
            System.out.println(String.format("The sum between %d and %d is %d", val1, val2, sumRange(val1, val2)));
        }while(stop != 0);
    }

    /**
     * This method sums all of the integers within a given range.
     * @param s the lower value
     * @param e the higher value
     * @return (int) the sum within this range
     */
    public static int sumRange(int s, int e){
        int n;

        //Check the order of s and e
        if(s < e){ //If they're input correctly
            n = e - s + 1;
        } else if(s == e){ //If they're the same
            return s;
        }else{ //If they're input backwards
            n = s - e + 1;
        }

        return (n * (s + e)) / 2;
    }

    /**
     *
     * @param reqest
     * @return
     */
    private static int getNextInt(String reqest){
        int nextint = 0;
        System.out.println(reqest);
        if(in.hasNextInt()) {
            nextint = in.nextInt();
        }
        in.nextLine();
        return nextint;
    }
}
