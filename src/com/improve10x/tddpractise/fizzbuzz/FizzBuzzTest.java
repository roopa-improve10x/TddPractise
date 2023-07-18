package com.improve10x.tddpractise.fizzbuzz;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FizzBuzzTest {
    @Test
    public void nothing() {}

    @Test
    public void givenInteger_returnInteger() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String integer = fizzBuzz.findFizzBuzz(1);
        assertEquals("1", integer);
    }

    @Test
    public void givenZero_returnZero() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String zero = fizzBuzz.findFizzBuzz(0);
        assertEquals("0", zero);
    }

    @Test
    public void givenThree_returnFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String three = fizzBuzz.findFizzBuzz(9);
        assertEquals("Fizz", three);
    }

    @Test
    public void givenFive_returnBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String five = fizzBuzz.findFizzBuzz(5);
        assertEquals("Buzz", five);
    }

    @Test
    public void givenFifteen_returnFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String fifteen = fizzBuzz.findFizzBuzz(45);
        assertEquals("FizzBuzz", fifteen);
    }
}
