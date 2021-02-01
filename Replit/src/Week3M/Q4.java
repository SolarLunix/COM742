package Week3M;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 * Differences between LinkedLists and Arrays
 * Created by: Melissa Melaugh
 * Created on: 01/02/2021
 * Updated on: 01/02/2021
 * COM742:Week3M:Q4
 */
public class Q4 {
    public static void main(String[] args) {
        final String LOCATION = "C:\\Users\\Solar\\IdeaProjects\\COM742\\Replit\\src\\Week3M\\RandomNums.txt";
        LinkedList<Integer> listNum = readNumbers(LOCATION);
        System.out.println(listNum);
        listNum.add(10, 20);
        System.out.println(listNum);

        int[] arrayNum = readNumbers(LOCATION, 20);
        System.out.println(arrayToString(arrayNum));
        arrayNum = addToArray(arrayNum, 10, 20);
        System.out.println(arrayToString(arrayNum));
    }

    private static String arrayToString(int[] anArray){
        String out = "[";
        for (int i = 0; i < anArray.length; i++) {
            if( i == anArray.length -1){
                out += anArray[i];
            } else {
                out += anArray[i] + ", ";
            }//end if else
        }//end for
        out += "]";
        return out;
    }//end arrayToString

    private static int[] addToArray(int[] anArray, int index, int element){
        int[] newArray = new int[anArray.length +1];
        for(int i = 0; i < newArray.length; i++){
            if(i < index){
                newArray[i] = anArray[i];
            } else if (i == index) {
                newArray[i] = element;
            } else {
                newArray[i] = anArray[i-1];
            }//end if else
        }//end for
        return newArray;
    }//end addToArray

    public static int[] readNumbers(String filename, int amount) {
        try{
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            int[] numList = new int[amount];
            String str;;
            for(int i = 0; i < amount && (str = br.readLine())!=null; i++){
                numList[i] = Integer.parseInt(str);
            }//end for i
            return numList;
        } catch (IOException e){
            System.out.println("File was unable to be read");
            System.out.println(e);
        }//end trycatch
        return new int[amount];
    }//end readNumbers

    public static LinkedList<Integer> readNumbers(String filename) {
        try{
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            LinkedList<Integer> numbersList = new LinkedList<>();
            String str = "";
            while((str=br.readLine())!=null){
                numbersList.add(Integer.parseInt(str));
            }//end for i
            return numbersList;
        } catch (IOException e){
            System.out.println("File was unable to be read");
            System.out.println(e);
        }//end trycatch
        return new LinkedList<Integer> ();
    }//end readNumbers
}
