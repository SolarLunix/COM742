package Week3M;

import java.util.LinkedList;

/**
 * Work with Linked Lists
 * Created by: Melissa Melaugh
 * Created on: 01/02/2021
 * Updated on: 01/02/2021
 * COM742:Week3M:Q1
 */
public class Q1 {
    public static void main(String[] args) {
        LinkedList<Integer> numList = new LinkedList<>();
        System.out.println(numList);
        numList.add(2);
        numList.add(4);
        numList.add(8);
        numList.add(16);
        numList.add(32);
        numList.add(64);
        System.out.println(numList);

        numList.add(128);
        System.out.println(numList);

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(9);
        numbers.add(12);
        System.out.println(numbers);

        numList.addAll(3, numbers);
        System.out.println(numList);

        System.out.println(String.format("The number at position 5 is %d", numList.get(5)));

        numList.set(6, 23);
        System.out.println(numList);

        numList.remove(Integer.valueOf(16));
        System.out.println(numList);

        numList.forEach(s -> System.out.println(s));
    }
}
