package cris.thoughtworks.projecteuler;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class MultipleOfNumberCheckerTest {

    @Test
    public void shouldReturnTrueWhenCheckingIfNumber3IsMultipleOf3() {
        MultipleOfNumberChecker multipleOfNumberChecker = new MultipleOfNumberChecker();

        boolean isMultipleOf3 = multipleOfNumberChecker.isMultipleOf3(3);

        assertTrue(isMultipleOf3);
    }
}
