package Week5M;

/**
 * //TODO: Project Description
 * Created by: Melissa Melaugh
 * Created on: 15/02/2021
 * Updated on: 15/02/2021
 * COM742:Week5M:Q03
 */
public class Q03 {
    public static void main(String[] args) {
        System.out.println("The sum of the value 341 is: " + getSum(341));
        System.out.println("The sum of the value 341 is: " + sum_of_digit(341));
    }

    public static int getSum(int value){
        int total = 0;
        while(value > 0){
            total += value%10;
            value /= 10;
        }//end while
        return total;
    }//end getSum

    public static int sum_of_digit(int n) {
        int total = 0;
        if(n > 0){
            total += sum_of_digit(n/10);
            total += n%10;
        }
        return total;
    }
}
