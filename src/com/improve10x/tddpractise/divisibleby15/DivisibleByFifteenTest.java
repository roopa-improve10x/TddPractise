package com.improve10x.tddpractise.divisibleby15;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DivisibleByFifteenTest {
    @Test
    public void nothing(){}

    @Test
    public void givenMultipleOfFifteen_returnResult() {
        Division division = new Division();
        boolean result = division.divisibleBy15(15);
        assertEquals(true, result);
    }

    @Test
    public void givenNumber_returnResult() {
        Division division = new Division();
        boolean result = division.divisibleBy15(45);
        assertEquals(true, result);
    }

    @Test
    public void givenInteger_returnFalse() {
        Division division = new Division();
        boolean result = division.divisibleBy15(123);
        assertEquals(false, result);
    }
}
