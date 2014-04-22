package cris.thoughtworks.projecteuler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cristianpinto on 4/22/14.
 */
public class EvenFibonacci {
    public boolean checkIfNumberIsEven(int number) {
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
}
