package cris.thoughtworks.projecteuler;

public class SumSquareDifference {
    public int getSumOfTheSquareOfNumbersBelowLimit(int limit) {
        int result = 0;
        for (int i = 1; i <= limit; i++) {
            result += i * i;
        }
        return result;
    }

    public int getSquareOfTheSumOfNumbersBelowLimit(int limit) {
        int result = 0;
        for (int i = 1; i <= limit; i++) {
            result += i;
        }
        return result * result;
    }

    public int getDifferenceBetweenTheSumOfSquaresOfNaturalNumbersAndTheSquareOfTheSum(int limit) {
        return getSquareOfTheSumOfNumbersBelowLimit(limit) - getSumOfTheSquareOfNumbersBelowLimit(limit);
    }
}
