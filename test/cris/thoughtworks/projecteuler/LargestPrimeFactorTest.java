package cris.thoughtworks.projecteuler;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
}
