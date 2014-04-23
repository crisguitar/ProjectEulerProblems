package cris.thoughtworks.projecteuler.app;

import cris.thoughtworks.projecteuler.EvenFibonacci;
import cris.thoughtworks.projecteuler.MultiplesOf3And5Adder;

/**
 * Created by cristianpinto on 4/22/14.
 */
public class Application {

    public static void main(String ... args) {

        MultiplesOf3And5Adder multiplesOf3And5Adder = new MultiplesOf3And5Adder();
        int firstResult = multiplesOf3And5Adder.addNumbersBelowTo(1000);

        EvenFibonacci evenFibonacci = new EvenFibonacci();
        int secondResult = evenFibonacci.addEvenFibonacciUpTo(4000000);

        System.out.println(firstResult);
        System.out.println(secondResult);
    }
}
