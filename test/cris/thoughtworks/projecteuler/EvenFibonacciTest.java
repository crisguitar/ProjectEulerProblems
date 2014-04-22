package cris.thoughtworks.projecteuler;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by cristianpinto on 4/22/14.
 */
public class EvenFibonacciTest {

    @Test
    public void shouldCheckIfNumberIsEven() {
        EvenFibonacci evenFibonacci = new EvenFibonacci();

        boolean isEven = evenFibonacci.checkIfNumberIsEven(4);

        assertTrue(isEven);
    }

    @Test
    public void shouldGenerateFibonacciNumbersWithValueLimit() {
        EvenFibonacci evenFibonacci = new EvenFibonacci();
        List<Integer> expectedNumbers = new ArrayList<Integer>();
        expectedNumbers.add(1);
        expectedNumbers.add(2);
        expectedNumbers.add(3);
        expectedNumbers.add(5);
        expectedNumbers.add(8);
        expectedNumbers.add(13);

        List<Integer> actualNumbers = evenFibonacci.getFibonacciNumbersWithValueLimit(15);

        assertArrayEquals(expectedNumbers.toArray(), actualNumbers.toArray());
    }
}
