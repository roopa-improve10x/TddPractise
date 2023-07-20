package com.improve10x.tddpractise.nthevennumber;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NthEvenTest {
    @Test
    public void nothing() {}

    @Test
    public void givenMinusTen_returnMinusOne() {
        EvenNumber evenNumber = new EvenNumber();
        int result = evenNumber.findNthEvenNumber(-10);
        assertEquals(-1, result);
    }

    @Test
    public void givenMinusOne_returnMinusOne() {
        EvenNumber evenNumber = new EvenNumber();
        int result = evenNumber.findNthEvenNumber(-1);
        assertEquals(-1, result);
    }

    @Test
    public void givenZero_returnOne() {
        EvenNumber evenNumber = new EvenNumber();
        int result = evenNumber.findNthEvenNumber(0);
        assertEquals(1, result);
    }

    @Test
    public void givenFour_returnFourthEvenNumber() {
        EvenNumber evenNumber = new EvenNumber();
        int result = evenNumber.findNthEvenNumber(4);
        assertEquals(6, result);
    }

    @Test
    public void givenTen_return10thEvenNumber() {
        EvenNumber evenNumber = new EvenNumber();
        int result = evenNumber.findNthEvenNumber(10);
        assertEquals(18, result);
    }

    @Test
    public void given100_return100thEvenNumber() {
        EvenNumber evenNumber = new EvenNumber();
        int result = evenNumber.findNthEvenNumber(100);
        assertEquals(198, result);
    }

    @Test
    public void given1000_return1000thEvenNumber() {
        EvenNumber evenNumber = new EvenNumber();
        int result = evenNumber.findNthEvenNumber(1000);
        assertEquals(1998, result);
    }

}
