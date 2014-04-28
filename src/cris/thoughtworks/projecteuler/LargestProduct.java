package cris.thoughtworks.projecteuler;

public class LargestProduct {
    public long find(String sequence) {
        int largestProduct = 0;
        int times = sequence.length();
        for (int i = 0; i <= times - 5; i++) {
            int temp = findSumOfFiveNumbersInString(sequence);
            if (temp > largestProduct) {
                largestProduct = temp;
            }
            sequence = sequence.substring(1);
            if (!keepGoing(sequence)) {
                return largestProduct;
            }
        }
        return largestProduct;
    }

    private int findSumOfFiveNumbersInString(String sequence) {
        int temp = 1;
        for (int j = 0; j < 5; j++) {
            temp *= Character.getNumericValue(sequence.charAt(j));
        }
        return temp;
    }

    public boolean keepGoing(String sequence) {
        return sequence.length() >= 5;
    }
}