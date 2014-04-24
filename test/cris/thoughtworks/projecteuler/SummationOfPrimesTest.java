package cris.thoughtworks.projecteuler;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class SummationOfPrimesTest {

    @Test
    public void shouldReturnTrueWhenNumberIsPrime() {
        SummationOfPrimes summationOfPrimes = new SummationOfPrimes();

        boolean isPrime = summationOfPrimes.isPrimeNumber(7);

        assertTrue(isPrime);
    }

    @Test
    public void shouldFindTheSumOfPrimeNumbersBelowLimit() {
        SummationOfPrimes summationOfPrimes = new SummationOfPrimes();

        int result = summationOfPrimes.findSum(10);

        assertEquals(17, result);
    }
}
