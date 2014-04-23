package cris.thoughtworks.projecteuler;

import java.util.ArrayList;
import java.util.List;

public class LargestPrimeFactor {

    public boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public List<Integer> getPrimeFactorsOf(int number) {
        List<Integer> primeFactors = new ArrayList<Integer>();
        for (int i = 2; i < number; i++) {
            if (number % i == 0 && isPrime(i)) {
                primeFactors.add(i);
            }
        }
        return primeFactors;
    }

    public int getLargestPrimeFactorOf(int number) {
        List<Integer> primeFactors = getPrimeFactorsOf(number);
        return primeFactors.get(primeFactors.size() - 1);
    }
}
