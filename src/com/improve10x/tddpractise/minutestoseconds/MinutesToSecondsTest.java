package com.improve10x.tddpractise.minutestoseconds;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MinutesToSecondsTest {

    @Test
    public void nothing() {
    }

    /* 5 minutes --> 300 seconds
    * 6 minutes --> 360 seconds
    * 10 minutes --> 600 seconds*/

    @Test
    public void givenMinutes_returnSeconds() {
        Minutes minutes = new Minutes();
        int seconds = minutes.convertMinsToSecs(5);
        assertEquals(300, seconds);
    }

    @Test
    public void givenZeroMinutes_returnZero() {
     Minutes minutes = new Minutes();
     int seconds = minutes.convertMinsToSecs(0);
     assertEquals(0, seconds);
    }

    @Test
    public void givenNegativeNum_returnNegativeValue() {
        Minutes minutes = new Minutes();
        int seconds = minutes.convertMinsToSecs(-3);
        assertEquals(-180, seconds);
    }
}
