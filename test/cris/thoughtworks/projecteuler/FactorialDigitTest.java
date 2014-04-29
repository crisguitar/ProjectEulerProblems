package cris.thoughtworks.projecteuler;

import org.junit.Test;

import java.math.BigInteger;

import static junit.framework.Assert.assertEquals;

public class FactorialDigitTest {

    @Test
    public void shouldReturnFactorialOfNumber() {
        FactorialDigit factorialDigit = new FactorialDigit();
        BigInteger result = factorialDigit.calculate(10);
        assertEquals(BigInteger.valueOf(3628800), result);
    }

    @Test
    public void shouldFindTheSumOfDigitsOfGivenNumber() {
        FactorialDigit factorialDigit = new FactorialDigit();
        BigInteger result = factorialDigit.sumOfFactorialDigits(10);
        assertEquals(BigInteger.valueOf(27), result);
    }
}