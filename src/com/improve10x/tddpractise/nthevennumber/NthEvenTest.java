package com.improve10x.tddpractise.nthevennumber;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NthEvenTest {
    @Test
    public void nothing() {}

    @Test
    public void giveZero_returnZerothNumber() {
        EvenNumber evenNumber = new EvenNumber();
        int result = evenNumber.isEven(0);
        assertEquals(-2, result);
    }

    @Test
    public void givenTwo_returnSecondEvenNumber() {
        EvenNumber evenNumber = new EvenNumber();
        int result = evenNumber.isEven(2);
        assertEquals(2, result);
    }

    @Test
    public void givenTwenty_return20thEvenNumber() {
        EvenNumber evenNumber = new EvenNumber();
        int result = evenNumber.isEven(20);
        assertEquals(38, result);
    }

    @Test
    public void given100_return100thEvenNumber() {
        EvenNumber evenNumber = new EvenNumber();
        int result = evenNumber.isEven(100);
        assertEquals(198, result);
    }

    @Test
    public void givenNegativeNumber_returnNegativeNumber() {
        EvenNumber evenNumber = new EvenNumber();
        int result = evenNumber.isEven(-5);
        assertEquals(-12, result);
    }
}
