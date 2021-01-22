package Week1M;

/**
 * Write a program called ‘Coins’ which should prompt a user to input an integer value and, using a switch statement,
 * determines if the coin is a valid sterling coin, to print it out in words. If the integer value does not represent a
 * valid coin it should print out an error message “Invalid coin value: xx” (where xx is the value entered).
 * Created by: Melissa Melaugh
 * Created on: 18/01/2021
 * Updated on: 18/01/2021
 * COM742:Week1M:Q3
 */
public class Q3 {
    public static void main(String[] args) {
        checkValid(1);
        checkValid(7);
    }

    private static void checkValid(int coin){
        switch(coin){
            case 1:
            case 2:
            case 5:
            case 10:
            case 50:
            case 100:
            case 200:
                System.out.println("You have a valid coin!");
            default:
                System.out.println(String.format("Invalid coin value: %d", coin));
        }
    }
}
