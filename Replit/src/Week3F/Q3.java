package Week3F;

import java.util.HashSet;

/**
 * Hashset tests
 * Created by: Melissa Melaugh
 * Created on: 07/02/2021
 * Updated on: 07/02/2021
 * COM742:Week3F:Q3
 */
public class Q3 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        HashSet<Integer> numbersEven = new HashSet<>();
        numbersEven.add(2);
        numbersEven.add(4);
        numbersEven.add(6);
        numbersEven.add(8);
        numbersEven.add(10);
        numbersEven.add(12);

        HashSet<Integer> numbersOdd = new HashSet<>();
        numbersOdd.add(1);
        numbersOdd.add(3);
        numbersOdd.add(5);
        numbersOdd.add(7);
        numbersOdd.add(9);

        System.out.println("Numbers: " + numbers);
        System.out.println("Numbers Even: " + numbersEven);
        System.out.println("Numbers Odd: " + numbersOdd);

        HashSet<Integer> diffNumNumOdd = difference(numbers, numbersOdd);
        HashSet<Integer> diffNumNumEven = difference(numbers, numbersEven);

        System.out.println("Differences between numbers and numbersOdd: " + diffNumNumOdd);
        System.out.println("Differences between numbers and numbersEven: " + diffNumNumEven);

        numbers.remove(4);
        numbersEven.remove(4);
        numbersOdd.remove(4);

        System.out.println("Numbers: " + numbers);
        System.out.println("Numbers Even: " + numbersEven);
        System.out.println("Numbers Odd: " + numbersOdd);

        System.out.println("Numbers Even is " + (numbers.containsAll(numbersEven)? "" : "not ") + "a subset of Numbers");
        System.out.println("Numbers Odd is " + (numbers.containsAll(numbersOdd)? "" : "not ") + "a subset of Numbers");
    }

    static HashSet<Integer> difference(HashSet<Integer> set1, HashSet<Integer> set2){
        HashSet<Integer> diff = new HashSet<>();
        diff.addAll(set1);
        diff.removeAll(set2);
        return diff;
    }
}
