package cris.thoughtworks.projecteuler;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class SummationOfPrimesTest {

    @Test
    public void shouldReturnTrueWhenNumberIsPrime() {
        SummationOfPrimes summationOfPrimes = new SummationOfPrimes();

        boolean isPrime = summationOfPrimes.isPrimeNumber(7);

        assertTrue(isPrime);
    }
}
