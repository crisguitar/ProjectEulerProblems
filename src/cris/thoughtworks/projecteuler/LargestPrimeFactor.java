package cris.thoughtworks.projecteuler;

public class LargestPrimeFactor {

    public int getLargestPrimeFactorOf(Long number) {
        int i;
        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }
        return i;
    }
}
