package com.improve10x.tddpractise.farmproblem;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FarmProblemTest {

    @Test
    public void nothing() {}

    @Test
    public void giveZero_returnZero() {
        Farm farm = new Farm();
        int totalLegs = farm.countTotalLegs(0, 5, 5);
        assertEquals(0, totalLegs);
    }

    @Test
    public void givenThreeValues_returnTotalLegs() {
        Farm farm = new Farm();
        int totalLegs = farm.countTotalLegs(2, 3,5);
        assertEquals(36, totalLegs);
    }

    @Test
    public void givenNegativeValue_returnNegativeValue() {
        Farm farm = new Farm();
        int totalLegs = farm.countTotalLegs(-5, 2, -7);
        assertEquals(-30, totalLegs);
    }

    @Test
    public void givenThreeNegativeValues_returnNegativeValues() {
        Farm farm = new Farm();
        int totalLegs = farm.countTotalLegs(-6, -8, -7);
        assertEquals(-72, totalLegs);
    }
}
