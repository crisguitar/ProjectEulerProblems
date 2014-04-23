package cris.thoughtworks.projecteuler;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SmallestMultipleTest {

    @Test
    public void shouldReturnOneWhenParameterIsOne() {
        SmallestMultiple smallestMultiple = new SmallestMultiple();

        int result = smallestMultiple.get(1);

        assertEquals(1, result);
    }

    @Test
    public void shouldReturnTwoWhenParameterIsTwo() {
        SmallestMultiple smallestMultiple = new SmallestMultiple();

        int result = smallestMultiple.get(2);

        assertEquals(2, result);
    }

    @Test
    public void shouldReturnSixWhenParameterIsThree() {
        SmallestMultiple smallestMultiple = new SmallestMultiple();

        int result = smallestMultiple.get(3);

        assertEquals(6, result);
    }
}
