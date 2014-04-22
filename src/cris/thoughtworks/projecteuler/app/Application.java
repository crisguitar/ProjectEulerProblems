package cris.thoughtworks.projecteuler.app;

import cris.thoughtworks.projecteuler.MultiplesOf3And5Adder;

/**
 * Created by cristianpinto on 4/22/14.
 */
public class Application {

    public static void main(String ... args) {

        MultiplesOf3And5Adder multiplesOf3And5Adder = new MultiplesOf3And5Adder();
        int result = multiplesOf3And5Adder.addNumbersBelowTo(1000);

        System.out.println(result);
    }
}
