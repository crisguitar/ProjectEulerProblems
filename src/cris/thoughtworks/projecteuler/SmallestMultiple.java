package cris.thoughtworks.projecteuler;

public class SmallestMultiple {
    public int get(int number) {
        int smallestMultiple = 0;
        boolean isSmallestMultiple = false;
        while (!isSmallestMultiple) {
            smallestMultiple++;
            int i = 1;
            do {
                isSmallestMultiple = smallestMultiple % i == 0;
                i++;
            } while (isSmallestMultiple && i <= number);
        }
        return smallestMultiple;
    }
}