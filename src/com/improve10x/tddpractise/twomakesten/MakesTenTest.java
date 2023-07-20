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
    public void givenZeroZero_returnFalse() {
        boolean isEqual = ten.makesTen(0, 0);
        assertEquals(false, isEqual);
    }

    @Test
    public void givenZeroOne_returnFalse() {
        boolean isEqualsTen = ten.makesTen(0, 1);
        assertEquals(false, isEqualsTen);
    }

    @Test
    public void givenOneTwo_returnFalse() {
        boolean isEqualsTen = ten.makesTen(1, 2);
        assertEquals(false, isEqualsTen);
    }

    @Test
    public void givenTwoThree_returnFalse() {
        boolean isEqualsTen = ten.makesTen(2, 3);
        assertEquals(false, isEqualsTen);
    }

    @Test
    public void givenThreeFour_returnFalse() {
        boolean isEqualsTen = ten.makesTen(3, 4);
        assertEquals(false, isEqualsTen);
    }

    @Test
    public void givenFourFive_returnFalse() {
        boolean isEqualsTen = ten.makesTen(4, 5);
        assertEquals(false, isEqualsTen);
    }

    @Test
    public void givenFiveFive_returnTrue() {
        boolean isEqualsTen = ten.makesTen(5, 5);
        assertEquals(true, isEqualsTen);
    }

    @Test
    public void givenSixFour_returnTrue() {
        boolean isEqualsTen = ten.makesTen(6, 4);
        assertEquals(true, isEqualsTen);
    }

    @Test
    public void givenSevenThree_returnTrue() {
        boolean isEqualsTen = ten.makesTen(7, 3);
        assertEquals(true, isEqualsTen);
    }

    @Test
    public void givenEightTwo_returnTrue() {
        boolean isEqualsTen = ten.makesTen(8, 2);
        assertEquals(true, isEqualsTen);
    }

    @Test
    public void givenNineOne_returnTrue() {
        boolean isEqualsTen = ten.makesTen(9, 1);
        assertEquals(true, isEqualsTen);
    }
}
