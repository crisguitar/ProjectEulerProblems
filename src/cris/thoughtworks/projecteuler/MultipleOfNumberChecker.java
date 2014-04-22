package cris.thoughtworks.projecteuler;

/**
 * Created by cristianpinto on 4/22/14.
 */
public class MultipleOfNumberChecker {

    public boolean numberIsMultipleOf3Or5(int number) {
        return (number % 3) == 0 || (number % 5) == 0;
    }
}
