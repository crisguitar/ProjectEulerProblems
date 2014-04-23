package cris.thoughtworks.projecteuler;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargestPrimeFactorTest {

    @Test
    public void shouldReturnLargestPrimeFactor() {
        LargestPrimeFactor largestPrimeFactor = new LargestPrimeFactor();
        int expectedPrimeFactor = 29;

        int actualPrimeFactor = largestPrimeFactor.getLargestPrimeFactorOf(13195L);

        assertEquals(expectedPrimeFactor, actualPrimeFactor);
    }
}
