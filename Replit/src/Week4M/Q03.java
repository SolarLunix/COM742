package Week4M;

/**
 * Change things in an array
 * Created by: Melissa Melaugh
 * Created on: 08/02/2021
 * Updated on: 08/02/2021
 * COM742:Week4M:Q03
 */
public class Q03 {
    public static void main(String[] args) {
        int[][] tda = new int[][] {{1,2,3},{4,5,6},{7,8,9},{1,1,1}};

        tda[3][2] = 9;
        tda[1][2] = 0;

        for(int[] row : tda){
            for(int item : row){
                System.out.print(String.format("%d ", item));
            }//end for item in row
            System.out.println();
        }//end for row in tda
    }//end main
}
