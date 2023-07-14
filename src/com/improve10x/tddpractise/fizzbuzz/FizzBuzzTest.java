package com.improve10x.tddpractise.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @Before
    public void setup() {
        fizzBuzz = new FizzBuzz();
    }
    @Test
    public void nothing() {
    }

   /* @Test
    public void givenEmpty_returnEmpty() {
        String empty = fizzBuzz.findFizzBuzz(0);
        assertEquals("", empty);
    }
*/
    @Test
    public void givenFifteenNumber_returnFizzBuzz() {
        String fifteen = fizzBuzz.findFizzBuzz(15);
        assertEquals("FizzBuzz", fifteen);
    }

    @Test
    public void givenThreeNumber_returnFizz() {
        String three = fizzBuzz.findFizzBuzz(3);
        assertEquals("Fizz", three);
    }

    @Test
    public void givenFive_returnBuzz(){
        String five = fizzBuzz.findFizzBuzz(5);
        assertEquals("Buzz", five);
    }

    @Test
    public void givenOne_returnOne() {
        String one = fizzBuzz.findFizzBuzz(1);
        assertEquals("1", one);
    }
}
