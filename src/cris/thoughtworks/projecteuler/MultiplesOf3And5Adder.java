package cris.thoughtworks.projecteuler;

/**
 * Created by cristianpinto on 4/22/14.
 */
public class MultiplesOf3And5Adder {

    private MultipleOfNumberChecker multipleOfNumberChecker;

    public MultiplesOf3And5Adder() {
        this.multipleOfNumberChecker = new MultipleOfNumberChecker();
    }

    public int addNumbersBelowTo(int limit) {
        int result = 0;
        for(int number = 1; number < limit;number++) {
            if (multipleOfNumberChecker.numberIsMultipleOf3Or5(number)) {
                result += number;
            }
        }
        return result;
    }
}
