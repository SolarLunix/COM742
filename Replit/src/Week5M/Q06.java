package Week5M;

/**
 * //TODO: Project Description
 * Created by: Melissa Melaugh
 * Created on: 19/02/2021
 * Updated on: 19/02/2021
 * COM742:Week5M:Q06
 */
public class Q06 {
    public static void main(String[] args) {
        System.out.println(NumSeq(50));
    }//end main

    public static int NumSeq(int number) {
        if(number <= 5){
            return 5;
        } else {
            int current = NumSeq(number - 3);
            System.out.print(current + ", ");
            return current + 3;
        }//end if else
    }//end NumSeq
}
