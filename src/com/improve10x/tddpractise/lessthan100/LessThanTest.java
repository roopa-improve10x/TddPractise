package com.improve10x.tddpractise.lessthan100;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LessThanTest {

    private Number number;
    @Before
    public void setUp() {
        number = new Number();
    }
    @Test
    public void nothing() {
    }
    /* if two numbers sum is less than 100 then return true
    * 10, 15 = 25 -> true
    * 1, 99 = 100 -> true
    * 100, 1 = 101 -> false
    * 0, -1 -> -1 -> false
    * 1, 0 = 1 -> true*/
    @Test
    public void givenTwoInputs_returnResult() {
        boolean result = number.isLessThan100(10, 15);
        assertEquals(true, result);
    }

    @Test
    public void givenInputs_returnResult() {
        boolean result = number.isLessThan100(1, 99);
        assertEquals(true, result);
    }

    @Test
    public void givenInput_returnResult() {
        boolean result = number.isLessThan100(100, 1);
        assertEquals(false, result);
    }

    @Test
    public void givenNegative_returnFalse() {
        boolean result = number.isLessThan100(0, -1);
        assertEquals(true, result);
    }
}
