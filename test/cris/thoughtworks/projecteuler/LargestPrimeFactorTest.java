package cris.thoughtworks.projecteuler;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LargestPrimeFactorTest {

    @Test
    public void shouldReturnFalseWhenNumberIsNotPrime() {
        LargestPrimeFactor largestPrimeFactor = new LargestPrimeFactor();

        boolean isPrime = largestPrimeFactor.isPrime(4);

        assertFalse(isPrime);
    }

    @Test
    public void shouldReturnTrueWhenNumberIsPrime() {
        LargestPrimeFactor largestPrimeFactor = new LargestPrimeFactor();

        boolean isPrime = largestPrimeFactor.isPrime(7);

        assertTrue(isPrime);
    }

    @Test
    public void shouldReturnListOfPrimeFactorsOfGivenNumber() {
        LargestPrimeFactor largestPrimeFactor = new LargestPrimeFactor();

        Integer[] expectedPrimeFactors = {5, 7, 13, 29};

        List<Integer> actualPrimeFactors = largestPrimeFactor.getPrimeFactorsOf(13195);

        assertArrayEquals(expectedPrimeFactors, actualPrimeFactors.toArray());
    }

    @Test
    public void shouldReturnLargestPrimeFactor() {
        LargestPrimeFactor largestPrimeFactor = new LargestPrimeFactor();
        int expectedPrimeFactor = 29;

        int actualPrimeFactor = largestPrimeFactor.getLargestPrimeFactorOf(13195);

        assertEquals(expectedPrimeFactor, actualPrimeFactor);
    }
}
