package Week1M;

/**
 * Follow the instructions
 * Created by: Melissa Melaugh
 * Created on: 18/01/2021
 * Updated on: 18/01/2021
 * COM742:Week1M:Q2
 */
public class Q2 {
    public static void main(String[] args) {
        //Develop a program that sets the variables, p, q, r, s, t as follows:

        //p is set to 7; q is set to -4;
        int p = 7;
        int q = -4;
        //r is set to 3 times p plus four times q;
        int r = 3 * p + 4 * q;
        //s is set to 5 times p plus 6 times r;
        int s = 5 * p + 6 * r;
        //if r is greater than s then t is set to p plus q plus r
        //else t is set to p plus q plus s
        int t;
        if(r > s){
            t = p + q + r;
        } else {
            t = p + q + s;
        }
        //Print out the final value of each of the variables with an appropriate message.

        System.out.println(String.format("p: %d \nq: %d \nr: %d \ns: %d \nt: %d", p, q, r, s, t));
    }
}
