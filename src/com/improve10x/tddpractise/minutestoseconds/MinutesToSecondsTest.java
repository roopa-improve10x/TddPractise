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
    public void givenSeconds_returnMinutes() {
        Seconds seconds = new Seconds();
        int minutes = seconds.convertSecsToMins(6);
        assertEquals(360, minutes);

    }
}
