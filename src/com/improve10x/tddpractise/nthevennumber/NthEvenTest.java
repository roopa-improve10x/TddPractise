package com.improve10x.tddpractise.nthevennumber;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NthEvenTest {
    @Test
    public void nothing() {}

    @Test
    public void givenNegative_returnNegativeNumber() {
        EvenNumber evenNumber = new EvenNumber();
        int result = evenNumber.findNthEvenNumber(-10);
        assertEquals(-1, result);
    }

    @Test
    public void givenNegativeValue_returnMinusOne() {
        EvenNumber evenNumber = new EvenNumber();
        int result = evenNumber.findNthEvenNumber(-3);
        assertEquals(-1, result);
    }

    @Test
    public void givenZero_returnOne() {
        EvenNumber evenNumber = new EvenNumber();
        int result = evenNumber.findNthEvenNumber(0);
        assertEquals(1, result);
    }

    @Test
    public void givenTwo_returnSecondEvenNumber() {
        EvenNumber evenNumber = new EvenNumber();
        int result = evenNumber.findNthEvenNumber(2);
        assertEquals(2, result);
    }

    @Test
    public void givenTwenty_return20thEvenNumber() {
        EvenNumber evenNumber = new EvenNumber();
        int result = evenNumber.findNthEvenNumber(20);
        assertEquals(38, result);
    }

    @Test
    public void given100_return100thEvenNumber() {
        EvenNumber evenNumber = new EvenNumber();
        int result = evenNumber.findNthEvenNumber(100);
        assertEquals(98, result);
    }

    @Test
    public void given2000_return2000thEvenNumber() {
        EvenNumber evenNumber = new EvenNumber();
        int result = evenNumber.findNthEvenNumber(2000);
        assertEquals(3998, result);
    }

}
