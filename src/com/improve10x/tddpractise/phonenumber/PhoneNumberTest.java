package com.improve10x.tddpractise.phonenumber;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PhoneNumberTest {

    @Test
    public void nothing() {}

    @Test
    public void givenEmptyArray_returnString() {
        PhoneNumber number = new PhoneNumber();
        String formatPhoneNum = number.getPhoneNumber(new int[] {});
        assertEquals("", formatPhoneNum);
    }

    @Test
    public void givenArrayElements_returnString() {
        PhoneNumber number = new PhoneNumber();
        String formatPhoneNumber = number.getPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
        assertEquals("(123) 456-7890", formatPhoneNumber);
    }

    @Test
    public void givenTenElementsOfArray_returnString() {
        PhoneNumber number = new PhoneNumber();
        String formatPhoneNumber = number.getPhoneNumber(new int[] {0, 4, 4, 1, 3, 8, 9, 8, 7, 6});
        assertEquals("(044) 138-9876", formatPhoneNumber);
    }

    @Test
    public void givenArrayWithTenValues_returnString() {
        PhoneNumber number = new PhoneNumber();
        String formatPhoneNumber = number.getPhoneNumber(new int[] {1, 5, 7, 4, 3, 2, 7, 0, 8, 9});
        assertEquals("(157) 432-7089", formatPhoneNumber);
    }
}
