package cris.thoughtworks.projecteuler;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SumSquareDifferenceTest {

    @Test
    public void shouldFindTheSumOfTheSquareOfNumbersBelowLimit() {
        SumSquareDifference sumSquareDifference = new SumSquareDifference();
        int expectedResult = 385;

        int actualResult = sumSquareDifference.getSumOfTheSquareOfNumbersBelowLimit(10);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldFindTheSquareOfTheSumOfNumbersBelowLimit() {
        SumSquareDifference sumSquareDifference = new SumSquareDifference();
        int expectedResult = 3025;

        int actualResult = sumSquareDifference.getSquareOfTheSumOfNumbersBelowLimit(10);

        assertEquals(expectedResult, actualResult);
    }
}
