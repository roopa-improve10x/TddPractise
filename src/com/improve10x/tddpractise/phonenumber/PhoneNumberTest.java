package com.improve10x.tddpractise.phonenumber;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PhoneNumberTest {

    private PhoneNumber phoneNumber;

    @Before
    public void setUp() {
        phoneNumber = new PhoneNumber();
    }

    @Test
    public void nothing() {}

    @Test
    public void givenEmptyArray_returnMinusOne() {
        String formatPhoneNum = phoneNumber.getPhoneNumber(new int[] {});
        assertEquals("-1", formatPhoneNum);
    }

    @Test
    public void givenArrayOfOneElement_returnMinusOne() {
        String formatPhoneNumber = phoneNumber.getPhoneNumber(new int[] {1});
        assertEquals("-1", formatPhoneNumber);
    }

    @Test
    public void givenArrayOfTwoElements_returnMinusOne() {
        String formatPhoneNumber = phoneNumber.getPhoneNumber(new int[] {1, 2});
        assertEquals("-1", formatPhoneNumber);
    }

    @Test
    public void givenArrayOfFourElements_returnMinusOne() {
        String formatPhoneNumber = phoneNumber.getPhoneNumber(new int[] {0, 1, 3, 2});
        assertEquals("-1", formatPhoneNumber);
    }

    @Test
    public void givenArrayElements_returnString() {
        String formatPhoneNumber = phoneNumber.getPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
        assertEquals("(123) 456-7890", formatPhoneNumber);
    }

    @Test
    public void givenTenElementsOfArray_returnString() {
        String formatPhoneNumber = phoneNumber.getPhoneNumber(new int[] {0, 4, 4, 1, 3, 8, 9, 8, 7, 6});
        assertEquals("(044) 138-9876", formatPhoneNumber);
    }

    @Test
    public void givenArrayWithTenValues_returnString() {
        String formatPhoneNumber = phoneNumber.getPhoneNumber(new int[] {1, 5, 7, 4, 3, 2, 7, 0, 8, 9});
        assertEquals("(157) 432-7089", formatPhoneNumber);
    }
}
