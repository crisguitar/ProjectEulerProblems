package cris.thoughtworks.projecteuler;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by cristianpinto on 4/22/14.
 */
public class MultiplesOf3And5AdderTest {

    @Test
    public void shouldReturn24WhenAddingMultiplesOf3And5Below10() {
        MultiplesOf3And5Adder multiplesOf3And5Adder = new MultiplesOf3And5Adder();

        int result = multiplesOf3And5Adder.addNumbersBelowTo(10);

        assertThat(result, is(23));
    }
}
