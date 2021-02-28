package Week5M;

import java.util.Scanner;

/**
 * create a factoral system.
 * Created by: Melissa Melaugh
 * Created on: 15/02/2021
 * Updated on: 15/02/2021
 * COM742:Week5M:Q01
 */
public class Q01 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int input = -1;
        do{
            input = getNextInt("Please enter a number to get its factoral, enter 0 to exit.");
            if(input > 0){
                System.out.println(String.format("%d! is %d", input, factorial(input)));
            } else if(input < 0){
                System.out.println("Invalid number");
            }//end if
        }while(input != 0);
        System.out.println("Thank you for using Factoral, have a great day!");
    }//end main

    public static int factorial (int number){
        if(number > 1){
            int fact = number * factorial(number - 1);
            System.out.println("Current factoral: " + fact);
            return fact;
        }
        System.out.println("Current factoral: 1");
        return 1;
    }//end factorial

    private static int getNextInt(String reqest){
        int nextint = -1;
        System.out.println(reqest);
        if(in.hasNextInt()) {
            nextint = in.nextInt();
        }
        in.nextLine();
        return nextint;
    }//end getNextInt
}
