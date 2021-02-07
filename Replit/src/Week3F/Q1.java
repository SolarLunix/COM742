package Week3F;

import java.util.HashSet;

/**
 * Hashset work
 * Created by: Melissa Melaugh
 * Created on: 05/02/2021
 * Updated on: 05/02/2021
 * COM742:Week3F:Q1
 */
public class Q1 {
    public static void main(String[] args) {
        HashSet<Integer> varA = new HashSet<>();
        varA.add(24);
        varA.add(26);
        varA.add(28);
        varA.add(30);
        varA.add(32);

        HashSet<Integer> varB = new HashSet<>();
        varB.add(30);
        varB.add(32);
        varB.add(35);
        varB.add(40);
        varB.add(45);
        varB.add(50);

        System.out.println("Var A: " + varA);
        System.out.println("Var B: " + varB);

        varA.add(34);
        varB.add(341);

        System.out.println("Var A: " + varA);
        System.out.println("Var B: " + varB);

        varA.retainAll(varB);

        System.out.println("Var A: " + varA);
        System.out.println("Var B: " + varB);
    }
}
