package com.improve10x.tddpractise.scoring;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ScoringTest {
    @Test
    public void nothing() {
    }

    /* calculateScore("A") -> [1, 0, 0]
    Calculate Score - ("B")  = {0, 1, 0}
    Calculate Score - ("C")  = {0, 0, 1}
    Calculate Score - ("ABC")  = {1, 1, 1}
    Calculate Score - ("AABC")  = {2, 1, 1}
    Calculate Score - ("ABBC")  = {1, 2, 1}
    Calculate Score - ("ABCC")  = {1, 1, 2}
    Calculate Score - ("ABCBACC")  = {2, 2, 3}*/


    @Test
    public void giveNull_returnAllZeros() {
        Scoring scoring = new Scoring();
        int[] allZeros = scoring.calculateScore("");
        assertArrayEquals(new int[3], allZeros);
    }

    @Test
    public void givenA_returnOneZeroZero() {
        Scoring scoring = new Scoring();
        int[] onlyAScore = scoring.calculateScore("A");
        assertArrayEquals(new int[] {1, 0, 0}, onlyAScore);
    }

    @Test
    public void givenB_returnZeroOneZero() {
        Scoring scoring = new Scoring();
        int[] onlyBScore = scoring.calculateScore("B");
        assertArrayEquals(new int[] {0, 1, 0}, onlyBScore);
    }

    @Test
    public void givenC_returnZeroZeroOne() {
        Scoring scoring = new Scoring();
        int[] onlyCScore = scoring.calculateScore("C");
        assertArrayEquals(new int[] {0, 0, 1}, onlyCScore);
    }

    @Test
    public void givenAB_returnOneOneZero() {
        Scoring scoring = new Scoring();
        int[] onlyABScore = scoring.calculateScore("AB");
        assertArrayEquals(new int[] {1, 1, 0}, onlyABScore);
    }

    @Test
    public void givenABC_returnOneOneOne() {
        Scoring scoring = new Scoring();
        int[] abcScore = scoring.calculateScore("ABC");
        assertArrayEquals(new int[] {1, 1, 1}, abcScore);
    }

    @Test
    public void givenAABC_returnTwoOneOne() {
        Scoring scoring = new Scoring();
        int[] aabcScore = scoring.calculateScore("AABC");
        assertArrayEquals(new int[] {2, 1, 1}, aabcScore);
    }

    @Test
    public void givenABBC_returnOneTwoOne() {
        Scoring scoring = new Scoring();
        int[] abbcScore = scoring.calculateScore("ABBC");
        assertArrayEquals(new int[] {1, 2, 1}, abbcScore);
    }

    @Test
    public void givenABCC_returnOneOneTwo() {
        Scoring scoring = new Scoring();
        int[] abccScore = scoring.calculateScore("ABCC");
        assertArrayEquals(new int[] {1, 1, 2}, abccScore);
    }

    @Test
    public void given_returnTwoTwoThree() {
        Scoring scoring = new Scoring();
        int[] abcScore = scoring.calculateScore("ABCBACC");
        assertArrayEquals(new int[] {2, 2, 3}, abcScore);
    }

    @Test
    public void givenABBACCCCAC_returnThreeTwoFive() {
        Scoring scoring = new Scoring();
        int[] abbaccccacScore = scoring.calculateScore("ABBACCCCAC");
        assertArrayEquals(new int[] {3, 2, 5}, abbaccccacScore);
    }
}
