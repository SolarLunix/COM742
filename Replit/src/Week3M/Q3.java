package Week3M;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 * //TODO: Project Description
 * Created by: Melissa Melaugh
 * Created on: 01/02/2021
 * Updated on: 01/02/2021
 * COM742:Week3M:Q3
 */
public class Q3 {
    public static void main(String[] args) {
        final String LOCATION = "C:\\Users\\Solar\\IdeaProjects\\COM742\\Replit\\src\\Week3M\\RandomNums.txt";
        LinkedList<Integer> listNum = readNumbers(LOCATION);
        System.out.println(listNum);

        listNum.add(0, 16);
        listNum.add(24);
        System.out.println(listNum);

        searchList(6, listNum);
        searchList(15, listNum);

        listNum.forEach(s -> System.out.println(String.format("%d: %d", listNum.indexOf(s), s))); //only works properly if there isn't doubles
        printPositions(listNum);

        listNum.removeLast();
        listNum.remove(4);
        listNum.removeFirst();
        System.out.println(listNum);

        LinkedList<Integer> newList = new LinkedList<>();
        newList.add(4);
        newList.add(7);
        newList.add(3);
        newList.add(42);
        newList.add(76);
        newList.add(39);
        System.out.println(newList);

        listNum.addAll(newList);
        System.out.println(listNum);

        System.out.println(String.format("The first value in the list was %d, it has now been removed.", popFirstElement(listNum)));
        System.out.println(listNum);

        newList = new LinkedList<>();
        searchList(32, listNum);
        searchList(32, newList);
    }//end main

    private static int popFirstElement(LinkedList<Integer> aList){
        int first = aList.getFirst();
        aList.removeFirst();
        return first;
    }//end popFirstElement

    private static void printPositions(LinkedList<Integer> aList){
        for(int i = 0; i < aList.size(); i++){
            System.out.println(String.format("%d: %d", i, aList.get(i)));
        }//end for
    }//end printPositions


    private static void searchList(int searchValue, LinkedList<Integer> searchList){
        if(searchList.size() == 0){
            System.out.println("This list is empty.");
        }else if(searchList.contains(Integer.valueOf(searchValue))){
            System.out.println(String.format("The value %d is at index %d.", searchValue, searchList.indexOf(Integer.valueOf(searchValue))));
        } else {
            System.out.println(String.format("The value %d is not contained in this list.", searchValue));
        }//end if else
    }//end searchList

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
