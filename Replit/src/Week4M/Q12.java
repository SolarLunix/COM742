package Week4M;

/**
 * Complete the methods
 * Created by: Melissa Melaugh
 * Created on: 08/02/2021
 * Updated on: 08/02/2021
 * COM742:Week4M:Q12
 */
public class Q12 {
    public static void main(String[] args) {

        int [][] rowmagic = new int[][] { {1,2,3}, {-1,5,2}, {4,0,2} };
        int [][] colmagic = new int[][] { {1,-1,4,10}, {3,5,0,-6} };
        int [] rowsum = allRowSums(rowmagic);
        int [] colsum = allColSums(rowmagic);

        for(int i = 0; i < rowsum.length; i++)
            System.out.println("All rows sums = " + rowsum[i]);

        for(int i = 0; i < colsum.length; i++)
            System.out.println("All cols sums = " + colsum[i]);

        System.out.println("Is row magic = " + isRowMagic(rowmagic));
        System.out.println("Is row magic = " + isRowMagic(colmagic));
        System.out.println("Is col magic = " + isColMagic(rowmagic));
        System.out.println("Is col magic = " + isColMagic(colmagic));
    }

    public static int[] allRowSums(int[][] a){
        int[] totals = new int[a.length];
        for(int row = 0; row < a.length; row++){
            for(int col = 0; col < a[0].length; col++){
                totals[row] += a[row][col];
            }//end for col
        }//end for row
        return totals;
    }//end allRowSums

    public static int[] allColSums(int[][] a){
        int[] totals = new int[a[0].length];
        for(int row = 0; row < a.length; row++){
            for(int col = 0; col < a[0].length; col++){
                totals[col] += a[row][col];
            }//end for col
        }//end for row
        return totals;
    }//end allColSums

    public static boolean isRowMagic(int[][] a){
        int[] rowSums = allRowSums(a);
        return isAllEqual(rowSums);
    }//end isRowMagic

    public static boolean isColMagic(int[][] a){
        int[] colSums = allColSums(a);
        return isAllEqual(colSums);
    }//end isColMagic

    public static boolean isAllEqual(int[] a){
        int value = a[0];
        for(int i = 1; i < a.length; i++){
            if(value != a[i]){
                return false;
            }//end if
        }//end for i
        return true;
    }//end isAllEqual
}
