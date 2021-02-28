package Week5M;

/**
 * //TODO: Project Description
 * Created by: Melissa Melaugh
 * Created on: 15/02/2021
 * Updated on: 15/02/2021
 * COM742:Week5M:Q04
 */
public class Q04 {
    public static void main(String[] args) {
        oddNumbers(30);
    }

    public static int oddNumbers(int number) {
        if(number%2 == 0){
            number -= 1;
        }

        if(number > 3){
            oddNumbers(number - 2);
        }
        System.out.print(number + ", ");
        return number;
    }
}
