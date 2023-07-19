package com.improve10x.tddpractise.divisiblebyfive;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DivisibleByFiveTest {
    @Test
    public void nothing() {}

    @Test
    public void givenValue_checkDivisibleByFive() {
        Divisible divisible = new Divisible();
        boolean result = divisible.isDivisibleByFive(5);
        assertEquals(true, result);
    }

    @Test
    public void givenTen_returnTrue() {
        Divisible divisible = new Divisible();
        boolean result = divisible.isDivisibleByFive(10);
        assertEquals(true, result);
    }

    @Test
    public void givenTwelve_returnFalse() {
        Divisible divisible = new Divisible();
        boolean result = divisible.isDivisibleByFive(12);
        assertEquals(false, result);
    }

    @Test
    public void givenHundred_returnTrue() {
        Divisible divisible = new Divisible();
        boolean result = divisible.isDivisibleByFive(100);
        assertEquals(true, result);
    }

    @Test
    public void givenZero_returnTrue() {
        Divisible divisible = new Divisible();
        boolean result = divisible.isDivisibleByFive(5);
        assertEquals(true, result);
    }
}
