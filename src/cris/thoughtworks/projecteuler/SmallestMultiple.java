package cris.thoughtworks.projecteuler;

/**
 * Created by cristianpinto on 4/23/14.
 */
public class SmallestMultiple {
    public int get(int number) {

        for(int i = 1;i <= number; i++) {
            if (i % number == 0)
            {
                return i;
            }
        }
        return 0;
    }
}
