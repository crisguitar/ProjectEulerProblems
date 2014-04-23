package cris.thoughtworks.projecteuler;

public class LargestPalindromeProduct {
    public boolean checkIfNumberIsPalindrome(int number) {
        String numberAsString = number + "";
        String reversedNumberAsString = new StringBuilder(numberAsString).reverse().toString();
        if (numberAsString.equals(reversedNumberAsString)) {
            return true;
        }
        return false;
    }
}
