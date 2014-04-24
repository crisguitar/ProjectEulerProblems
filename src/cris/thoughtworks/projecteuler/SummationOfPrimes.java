package cris.thoughtworks.projecteuler;

public class SummationOfPrimes {

    public boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int findSum(int limit) {
        int result = 0;
        int i = 2;
        while (i < limit) {
            if (isPrimeNumber(i)) {
                result += i;
            }
            i++;
        }
        return result;
    }
}
