package cris.thoughtworks.projecteuler;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class LargestProductTest {

    @Test
    public void shouldFindLargestProductOfFiveNumbersInA10DigitNumber() {
        LargestProduct largestProduct = new LargestProduct();

        long result = largestProduct.find("7316717653");

        assertEquals(1764L, result);
    }
}
