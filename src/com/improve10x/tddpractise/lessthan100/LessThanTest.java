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
    @Test
    public void givenZeroZero_returnTrue() {
        boolean result = number.isLessThan100(0, 0);
        assertEquals(true, result);
    }

    @Test
    public void givenZeroMinusOne_returnTrue() {
        boolean result = number.isLessThan100(0, -1);
        assertEquals(true, result);
    }

    @Test
    public void givenZeroOne_returnTrue() {
        boolean result = number.isLessThan100(0, 1);
        assertEquals(true, result);
    }

    @Test
    public void givenOneNinetyNine_returnTrue() {
        boolean result = number.isLessThan100(1, 99);
        assertEquals(true, result);
    }

    @Test
    public void givenHundredOne_returnFalse() {
        boolean result = number.isLessThan100(100, 1);
        assertEquals(false, result);
    }

    @Test
    public void givenNinetyNineFive_returnFalse() {
        boolean result = number.isLessThan100(99, 5);
        assertEquals(false, result);
    }
}
