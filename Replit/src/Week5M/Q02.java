package Week5M;

/**
 * Fibionnaci sequences
 * Created by: Melissa Melaugh
 * Created on: 15/02/2021
 * Updated on: 15/02/2021
 * COM742:Week5M:Q02
 */
public class Q02 {
    public static void main(String[] args) {
        System.out.println("The Fib for 0 is: " + fibonnaci(0));
        System.out.println("The Fib for 1 is: " + fibonnaci(1));
        System.out.println("The Fib for 2 is: " + fibonnaci(2));
        System.out.println("The Fib for 3 is: " + fibonnaci(3));
        System.out.println("The Fib for 4 is: " + fibonnaci(4));
        System.out.println("The Fib for 5 is: " + fibonnaci(5));
        System.out.println("The Fib for 6 is: " + fibonnaci(6));
    }//end main

    public static int fibonnaci(int number){
        if(number <= 0){
            return 0;
        } else if(number == 1){
            return 1;
        } else {
            return(fibonnaci(number-1) + fibonnaci(number-2));
        }

    }//end fibonnaci
}
