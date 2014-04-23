package cris.thoughtworks.projecteuler;

import java.util.ArrayList;
import java.util.List;

public class EvenFibonacci {
    public boolean isNumberEven(int number) {
        return number % 2 == 0;
    }

    public List<Integer> getFibonacciNumbersWithValueLimit(int limit) {
        List<Integer> fibonacciNumbers = new ArrayList<Integer>();
        int previousFibonacciNumber = 0;
        int fibonacciNumber = 1;

        while (fibonacciNumber + previousFibonacciNumber < limit) {
            int temporalNumber = fibonacciNumber;
            fibonacciNumbers.add(fibonacciNumber += previousFibonacciNumber);
            previousFibonacciNumber = temporalNumber;
        }

        return fibonacciNumbers;
    }

    public int addEvenFibonacciUpTo(int limit) {
        List<Integer> fibonacciNumbers = getFibonacciNumbersWithValueLimit(limit);
        int result = 0;
        for (Integer fibonacciNumber : fibonacciNumbers) {
            if (isNumberEven(fibonacciNumber)) {
                result += fibonacciNumber;
            }
        }
        return result;
    }
}