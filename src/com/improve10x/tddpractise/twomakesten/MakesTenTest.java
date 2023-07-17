package com.improve10x.tddpractise.twomakesten;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MakesTenTest {

    private MakesTen ten;
    @Before
    public void setUp() {
        ten = new MakesTen();
    }
    @Test
    public void nothing() {
    }

    @Test
    public void givenSum_returnEqualOrNotToTen() {
        boolean isEqual = ten.makesTen(10, 9);
        assertEquals(false, isEqual);
    }

    @Test
    public void givenTwoValues_returnTrueOrFalse() {
        boolean isEqualsTen = ten.makesTen(1, 9);
        assertEquals(false, isEqualsTen);
    }

    @Test
    public void givenTwoInputs_returnResult() {
        boolean result = ten.makesTen(9,9);
        assertEquals(false, result);
    }

    @Test
    public void givenTwo_returnResult() {
        boolean result = ten.makesTen(2, 8);
        assertEquals(false, result);
    }
}
