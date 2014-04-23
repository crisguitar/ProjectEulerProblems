package cris.thoughtworks.projecteuler;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class LargestPalindromeProductTest {

    @Test
    public void shouldReturnTrueWhenNumberIsPalindrome() {
        LargestPalindromeProduct largestPalindromeProduct = new LargestPalindromeProduct();

        boolean isPalindrome = largestPalindromeProduct.isPalindrome(9009);

        assertTrue(isPalindrome);
    }

    @Test
    public void shouldReturn9009WhenFindingLargestPalindromeMadeFromTheProductOfTwoDigitNumbers() {
        LargestPalindromeProduct largestPalindromeProduct = new LargestPalindromeProduct();

        int result = largestPalindromeProduct.find(2);

        assertEquals(9009, result);
    }
}
