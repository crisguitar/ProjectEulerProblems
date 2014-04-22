package cris.thoughtworks.projecteuler;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

/**
 * Created by cristianpinto on 4/22/14.
 */
public class EvenFibonacciAdderTest {

    @Test
    public void shouldCheckIfNumberIsEven() {
        EvenFibonacciAdder evenFibonacciAdder = new EvenFibonacciAdder();

        boolean isEven = evenFibonacciAdder.checkIfNumberIsEven(4);

        assertTrue(isEven);
    }


}
