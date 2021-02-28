package Test;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Work with HashSets to produce answers
 * Created by: Melissa Melaugh
 * Created on: 12/02/2021
 * Updated on: 12/02/2021
 * COM742:Test:Sprint2
 */
public class Sprint2 {
    public static void main(String[] args) {
        final int MUL = 3;
        final int REMOVE = 4;

        HashSet<Integer> setA = makeSetA();
        HashSet<Integer> setB = makeSetB();

        union(setA, setB);

        intersection(setA, setB);

        difference(setA, setB);

        setA.removeAll(setA);
        System.out.println("Set A: " + setA);
        setA = makeSetA();

        System.out.println("Set B is " + (setA.containsAll(setB)? "" : "not ") + "a subset of SetA");

        System.out.println("Set B is " + (setB.isEmpty()? "" : "not ") + "empty");

        HashSet<Integer> setA3 = multiplySet(setA, MUL);
        HashSet<Integer> setB3 = multiplySet(setB, MUL);
        System.out.println("Set A * 3: " + setA3);
        System.out.println("Set B * 3: " + setB3);

        setA.remove(REMOVE);
        setB.remove(REMOVE);
        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);
    }//end main

    private static HashSet<Integer> makeSetA(){
        HashSet<Integer> setA = new HashSet<>();
        setA.add(2);
        setA.add(4);
        setA.add(6);
        setA.add(8);
        setA.add(10);
        setA.add(12);
        setA.add(14);
        setA.add(16);
        setA.add(17);
        System.out.println("Set A: " + setA);
        return setA;
    }//end makeSetA

    private static HashSet<Integer> makeSetB(){
        HashSet<Integer> setB = new HashSet<>();
        setB.add(1);
        setB.add(2);
        setB.add(3);
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);
        setB.add(8);
        setB.add(9);
        System.out.println("Set B: " + setB);
        return setB;
    }//end makeSetB

    private static void union(HashSet<Integer> setA, HashSet<Integer> setB){
        HashSet<Integer> union = new HashSet<>();
        union.addAll(setA);
        union.addAll(setB);
        System.out.println("The union of the two sets is: " + union);
    }//end union

    private static void intersection(HashSet<Integer> setA, HashSet<Integer> setB){
        HashSet<Integer> intersection = new HashSet<>();
        intersection.addAll(setA);
        intersection.retainAll(setB);
        System.out.println("The two sets have the following values in common: " + intersection);
    }//end intersection

    private static void difference(HashSet<Integer> setA, HashSet<Integer> setB){
        HashSet<Integer> difference = new HashSet<>();
        difference.addAll(setA);
        difference.removeAll(setB);
        System.out.println("The first set has the following unique values: " + difference);
    }//end difference

    private static HashSet<Integer> multiplySet(HashSet<Integer> aSet, int multiple){
        Iterator<Integer> multiplier = aSet.iterator();
        HashSet<Integer> multiplied = new HashSet<>();
        while(multiplier.hasNext()){
            multiplied.add(multiple * multiplier.next());
        }
        return multiplied;
    }//end multiplySet

    private static HashSet<Integer> divideSet(HashSet<Integer> aSet, int multiple){
        HashSet<Integer> newSet = new HashSet<>();
        for(int item : aSet) {
            newSet.add(item / multiple);
        }//end for item in aSet
        return newSet;
    }//end divideSet
}
