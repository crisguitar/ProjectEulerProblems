package cris.thoughtworks.projecteuler;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class MultipleOfNumberCheckerTest {

    private MultipleOfNumberChecker multipleOfNumberChecker;

    @Before
    public void setUp() {
        multipleOfNumberChecker = new MultipleOfNumberChecker();

    }

    @Test
    public void shouldReturnTrueWhenCheckingIfNumberIsMultipleOf3() {

        boolean isMultipleOf3 = multipleOfNumberChecker.numberIsMultipleOf(6, 3);

        assertTrue(isMultipleOf3);
    }

    @Test
    public void shouldReturnFalseWhenNumberIsNotMultipleOf3() {

        boolean isMultipleOf3 = multipleOfNumberChecker.numberIsMultipleOf(4, 3);

        assertFalse(isMultipleOf3);
    }

    @Test
    public void shouldReturnTrueWhenCheckingIfNumberIsMultipleOf5() {

        boolean isMultipleOf5 = multipleOfNumberChecker.numberIsMultipleOf(15, 5);

        assertTrue(isMultipleOf5);

    }

    @Test
    public void shouldReturnFalseWhenNumberIsNotMultipleOf5() {

        boolean isMultipleOf5 = multipleOfNumberChecker.numberIsMultipleOf(12, 5);

        assertFalse(isMultipleOf5);
    }
}
