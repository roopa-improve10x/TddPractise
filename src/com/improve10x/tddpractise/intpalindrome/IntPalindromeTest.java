package com.improve10x.tddpractise.intpalindrome;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IntPalindromeTest {

    private Palindrome palindrome;

    @Before
    public void setUp() {
        palindrome = new Palindrome();
    }
    @Test
    public void nothing() {}

    @Test
    public void givenZero_returnTrue() {
        boolean result = palindrome.isPalindrome(0);
        assertEquals(true, result);
    }

    @Test
    public void givenOneTwoOneNumber_returnPalindromeNumber() {
        boolean palindromeNum = palindrome.isPalindrome(121);
        assertEquals(true, palindromeNum);
    }

    @Test
    public void givenTwoOneTwoNumber_returnPalindromeNumber() {
        boolean palindromeNum = palindrome.isPalindrome(212);
        assertEquals(true, palindromeNum);
    }

    @Test
    public void givenOneZeroZeroOneNumber_returnPalindromeNumber() {
        boolean palindromeNum = palindrome.isPalindrome(1001);
        assertEquals(true, palindromeNum);
    }

    @Test
    public void givenOneHundredTwelveNumber_returnPalindromeNumber() {
        boolean palindromeNum = palindrome.isPalindrome(112);
        assertEquals(false, palindromeNum);
    }

    @Test
    public void givenFiveOneThreeNumber_returnPalindromeNumber() {
        boolean palindromeNum = palindrome.isPalindrome(513);
        assertEquals(false, palindromeNum);
    }


}
