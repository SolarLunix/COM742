package Week4M;

/**
 * 2D String array work
 * Created by: Melissa Melaugh
 * Created on: 08/02/2021
 * Updated on: 08/02/2021
 * COM742:Week4M:Q13
 */
public class Q13 {

    public static void main(String[] args) {

        String [][] grid = new String [3][3];

        grid[0][0] = "Jen"; grid[0][1] = "Sam"; grid[0][2] = "Ant";
        grid[1][0] = "Con"; grid[1][1] = "Amy"; grid[1][2] = "Zoe";
        grid[2][0] = "Ted"; grid[2][1] = "Eve"; grid[2][2] = "Jen";

        System.out.println("Name found: " + nameSearch(grid, "Amy"));
        System.out.println("Duplicates found: " + duplicateSearch(grid));
    }//end main

    public static boolean nameSearch(String [][]grid, String name){
        for(String[] row : grid){
            for(String value : row){
                if(value.equalsIgnoreCase(name)){
                    return true;
                }//end if
            }//end for value in row
        }//end for row in grid
        return false;
    }//end nameSearch

    public static boolean duplicateSearch(String [][]grid){
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                String name = grid[row][col];
                if(nameSearch(grid, name)){
                    return true;
                }//end if
            }//end for col
        }//end for row
        return false;
    }//end duplicateSearch
}
