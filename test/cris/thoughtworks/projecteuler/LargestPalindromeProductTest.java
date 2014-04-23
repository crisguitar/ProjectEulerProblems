package cris.thoughtworks.projecteuler;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class LargestPalindromeProductTest {

    @Test
    public void shouldReturnTrueWhenNumberIsPalindrome() {
        LargestPalindromeProduct largestPalindromeProduct = new LargestPalindromeProduct();

        boolean isPalindrome = largestPalindromeProduct.checkIfNumberIsPalindrome(9009);

        assertTrue(isPalindrome);
    }
}
