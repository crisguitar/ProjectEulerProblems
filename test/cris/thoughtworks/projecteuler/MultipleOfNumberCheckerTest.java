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

        boolean isMultipleOf3 = multipleOfNumberChecker.numberIsMultipleOf3Or5(6);

        assertTrue(isMultipleOf3);
    }

    @Test
    public void shouldReturnFalseWhenNumberIsNotMultipleOf3() {

        boolean isMultipleOf3 = multipleOfNumberChecker.numberIsMultipleOf3Or5(4);

        assertFalse(isMultipleOf3);
    }

    @Test
    public void shouldReturnTrueWhenCheckingIfNumberIsMultipleOf5() {

        boolean isMultipleOf5 = multipleOfNumberChecker.numberIsMultipleOf3Or5(15);

        assertTrue(isMultipleOf5);

    }

    @Test
    public void shouldReturnFalseWhenNumberIsNotMultipleOf5() {

        boolean isMultipleOf5 = multipleOfNumberChecker.numberIsMultipleOf3Or5(13);

        assertFalse(isMultipleOf5);
    }

    @Test
    public void shouldReturnTrueIfNumberIsMultipleOf3or5() {
        boolean isMultipleOf3Or5 = multipleOfNumberChecker.numberIsMultipleOf3Or5(12);

        assertTrue(isMultipleOf3Or5);
    }
}
