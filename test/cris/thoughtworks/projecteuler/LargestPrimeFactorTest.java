package cris.thoughtworks.projecteuler;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

/**
 * Created by cristianpinto on 4/23/14.
 */
public class LargestPrimeFactorTest {

    @Test
    public void shouldReturnFalseWhenNumberIsNotPrime() {
        LargestPrimeFactor largestPrimeFactor = new LargestPrimeFactor();

        boolean isPrime = largestPrimeFactor.isPrime(4);

        assertFalse(isPrime);
    }

}
