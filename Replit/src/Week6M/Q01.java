package Week6M;

import Week4M.*;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test items from Week4
 * Created by: Melissa Melaugh
 * Created on: 22/02/2021
 * Updated on: 22/02/2021
 * COM742:Week6M:Q01
 */
public class Q01 {

    @Test
    public void testArray2DMin() {
        // Failure message:
        // This test has no failure messages
        int [][]test = new int[3][4];
        test[0][0]=1; test[0][1]=3; test[0][2]=6;
        test[0][3]=8; test[1][0]=2; test[1][1]=6;
        test[1][2]=9; test[1][3]=-1; test[2][0]=4;
        test[2][1]=5; test[2][2]=3; test[2][3]=7;

        assertEquals(Q10.array2DMin(test),-1);
    }

}
