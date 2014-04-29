package cris.thoughtworks.projecteuler;

import java.math.BigInteger;

public class FactorialDigit {

    public BigInteger calculate(long number) {
        BigInteger result = BigInteger.ONE;
        for (long i = number; i > 0; i--) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public BigInteger sumOfFactorialDigits(long number) {
        String digits = String.valueOf(calculate(number));
        BigInteger result = BigInteger.ZERO;
        for (int i = 0; i < digits.length(); i++) {
            result = result.add(BigInteger.valueOf(Character.getNumericValue(digits.charAt(i))));
        }
        return result;
    }
}