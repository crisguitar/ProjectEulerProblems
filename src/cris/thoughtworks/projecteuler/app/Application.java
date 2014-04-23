package cris.thoughtworks.projecteuler.app;

import cris.thoughtworks.projecteuler.EvenFibonacci;
import cris.thoughtworks.projecteuler.LargestPrimeFactor;
import cris.thoughtworks.projecteuler.MultiplesOf3And5Adder;
import cris.thoughtworks.projecteuler.SmallestMultiple;

/**
 * Created by cristianpinto on 4/22/14.
 */
public class Application {

    public static void main(String ... args) {

        MultiplesOf3And5Adder multiplesOf3And5Adder = new MultiplesOf3And5Adder();
        int firstResult = multiplesOf3And5Adder.addNumbersBelowTo(1000);

        EvenFibonacci evenFibonacci = new EvenFibonacci();
        int secondResult = evenFibonacci.addEvenFibonacciUpTo(4000000);

        SmallestMultiple smallestMultiple = new SmallestMultiple();
        int thirdResult = smallestMultiple.get(20);

        LargestPrimeFactor largestPrimeFactor = new LargestPrimeFactor();
        int fourthResult = largestPrimeFactor.getLargestPrimeFactorOf(600851475143L);

        System.out.println(firstResult);
        System.out.println(secondResult);
        System.out.println(thirdResult);
        System.out.println(fourthResult);
    }
}
