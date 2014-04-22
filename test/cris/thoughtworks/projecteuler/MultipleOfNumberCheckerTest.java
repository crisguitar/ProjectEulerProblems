package cris.thoughtworks.projecteuler;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class MultipleOfNumberCheckerTest {

    @Test
    public void shouldReturnTrueWhenCheckingIfNumberIsMultipleOf3() {
        MultipleOfNumberChecker multipleOfNumberChecker = new MultipleOfNumberChecker();

        boolean isMultipleOf3 = multipleOfNumberChecker.isMultipleOf3(6);

        assertTrue(isMultipleOf3);
    }

    @Test
    public void shouldReturnFalseWhenNumberIsNotMultipleOf3() {
        MultipleOfNumberChecker multipleOfNumberChecker = new MultipleOfNumberChecker();

        boolean isMultipleOf3 = multipleOfNumberChecker.isMultipleOf3(4);

        assertFalse(isMultipleOf3);
    }

    @Test
    public void shouldReturnTrueWhenCheckingIfNumberIsMultipleOf5() {
        MultipleOfNumberChecker multipleOfNumberChecker = new MultipleOfNumberChecker();

        boolean isMultipleOf5 = multipleOfNumberChecker.isMultipleOf5(15);

        assertTrue(isMultipleOf5);

    }
}
