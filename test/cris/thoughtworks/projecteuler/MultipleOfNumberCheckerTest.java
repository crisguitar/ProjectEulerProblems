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

        boolean isMultipleOf3 = multipleOfNumberChecker.isMultipleOf3(6);

        assertTrue(isMultipleOf3);
    }

    @Test
    public void shouldReturnFalseWhenNumberIsNotMultipleOf3() {

        boolean isMultipleOf3 = multipleOfNumberChecker.isMultipleOf3(4);

        assertFalse(isMultipleOf3);
    }

    @Test
    public void shouldReturnTrueWhenCheckingIfNumberIsMultipleOf5() {

        boolean isMultipleOf5 = multipleOfNumberChecker.isMultipleOf5(15);

        assertTrue(isMultipleOf5);

    }
}
