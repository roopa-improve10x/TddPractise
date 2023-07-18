package com.improve10x.tddpractise.factorial;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FactorialTest {
    @Test
    public void nothing() {}

    @Test
    public void givenNegativeNumber_returnNegativeNumber() {
        Factorial factorial = new Factorial();
        int factNum = factorial.getFactorial(-10);
        assertEquals(-1, factNum);
    }

    @Test
    public void givenNegativeValue_returnNegativeValue() {
        Factorial factorial = new Factorial();
        int factNum = factorial.getFactorial(-1);
        assertEquals(-1, factNum);
    }

    @Test
    public void givenZeroValue_returnOne() {
        Factorial factorial = new Factorial();
        int factNum = factorial.getFactorial(0);
        assertEquals(1, factNum);
    }

    @Test
    public void givenOne_returnOne() {
        Factorial factorial = new Factorial();
        int factNum = factorial.getFactorial(1);
        assertEquals(1, factNum);
    }

    @Test
    public void givenFive_return120() {
        Factorial factorial = new Factorial();
        int factNum = factorial.getFactorial(5);
        assertEquals(120, factNum);
    }

    @Test
    public void givenThree_returnSix() {
        Factorial factorial = new Factorial();
        int factNum = factorial.getFactorial(3);
        assertEquals(6, factNum);
    }

    @Test
    public void givenSeven_return5040() {
        Factorial factorial = new Factorial();
        int factNum = factorial.getFactorial(-1);
        assertEquals(-1, factNum);
    }
}
