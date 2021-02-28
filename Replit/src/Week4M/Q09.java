package Week4M;

/**
 * Find a character in an array
 * Created by: Melissa Melaugh
 * Created on: 08/02/2021
 * Updated on: 08/02/2021
 * COM742:Week4M:Q09
 */
public class Q09 {
    public static void main(String[] args) {
        char [][]a = new char[][]{{'a','b','c'},{'d','d','d'},{'g','h','i'}};

        findChar2DArray(a,'b');
        findChar2DArray(a,'d');
        findChar2DArray(a,'z');
    }//end main

    private static boolean findChar2DArray(char[][] a, char value){
        for(int row = 0; row < a.length; row++){
            for(int col = 0; col < a[0].length; col++){
                if(a[row][col] == value){
                    System.out.println(String.format("Char: %s @ (%d, %d)", value, row, col));
                    return true;
                }//end if
            }//end for c in row
        }//end for row in a
        System.out.println(String.format("Char: %s not found", value));
        return false;
    }//end findChar2DArray
}
