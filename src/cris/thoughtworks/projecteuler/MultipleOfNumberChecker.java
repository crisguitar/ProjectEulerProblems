package cris.thoughtworks.projecteuler;

/**
 * Created by cristianpinto on 4/22/14.
 */
public class MultipleOfNumberChecker {
    public boolean numberIsMultipleOf(int number, int numberToCheck) {
        return (number % numberToCheck) == 0;
    }
}
