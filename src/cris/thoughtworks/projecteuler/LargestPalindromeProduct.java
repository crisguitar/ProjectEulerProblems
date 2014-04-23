package cris.thoughtworks.projecteuler;

public class LargestPalindromeProduct {
    public boolean isPalindrome(int number) {
        String numberAsString = number + "";
        String reversedNumberAsString = new StringBuilder(numberAsString).reverse().toString();
        if (numberAsString.equals(reversedNumberAsString)) {
            return true;
        }
        return false;
    }

    public int find(int digits) {
        int number = (int) Math.pow(10, digits) - 1;
        for (int i = number; i > 0; i--) {
            for (int j = number; j > 0; j--) {
                int product = i * j;
                if (isPalindrome(product)) {
                    return product;
                }
            }
        }
        return 0;
    }
}
