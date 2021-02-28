package Week6M;

import Week5M.Q01;
import Week5M.Q02;
import Week5M.Q03;
import Week5M.Q07;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testing Week5 Methods
 * Created by: Melissa Melaugh
 * Created on: 22/02/2021
 * Updated on: 22/02/2021
 * COM742:Week5M:Week5MTest
 */
public class Week5MTest {

    // Q01
    @Test
    public void factoral(){
        assertEquals(3628800, Q01.factorial(10));
    }

    // Q02
    @Test
    public void fib(){
        assertEquals(0, Q02.fibonnaci(0));
        assertEquals(1, Q02.fibonnaci(1));
        assertEquals(1, Q02.fibonnaci(2));
        assertEquals(2, Q02.fibonnaci(3));
        assertEquals(3, Q02.fibonnaci(4));
        assertEquals(5, Q02.fibonnaci(5));
        assertEquals(8, Q02.fibonnaci(6));
        assertEquals(13, Q02.fibonnaci(7));
    }

    // Q03
    @Test
    public void getSum(){
        assertEquals(6, Q03.getSum(321));
    }

    @Test
    public void sum_of_digit(){
        assertEquals(6, Q03.sum_of_digit(321));
    }

    // Q04 no test
    // Q05 no test
    // Q06 no test

    // Q07
    @Test
    public void bubbleSort() {
        int[] anArray = {10, 8, 6, 4, 2, 0};
        int[] aFinishedArray = {0, 2, 4, 6, 8, 10};
        Q07.bubbleSort(anArray, anArray.length);
        assertArrayEquals(anArray, aFinishedArray);
    }
}