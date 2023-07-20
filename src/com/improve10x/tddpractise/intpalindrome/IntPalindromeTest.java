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
    public void givenMinusTen_returnTrue() {
        boolean result = palindrome.isPalindrome(-10);
        assertEquals(true, result);
    }

    @Test
    public void givenMinusOne_returnTrue() {
        boolean result = palindrome.isPalindrome(-1);
        assertEquals(true, result);
    }

    @Test
    public void givenOne_returnTrue() {
        boolean result = palindrome.isPalindrome(1);
        assertEquals(true, result);
    }

    @Test
    public void givenTen_returnFalse() {
        boolean result = palindrome.isPalindrome(10);
        assertEquals(false, result);
    }

    @Test
    public void givenOneZeroOneNumber_returnTrue() {
        boolean palindromeNum = palindrome.isPalindrome(101);
        assertEquals(true, palindromeNum);
    }

    @Test
    public void givenOneOneZeroNumber_returnFalse() {
        boolean palindromeNum = palindrome.isPalindrome(110);
        assertEquals(false, palindromeNum);
    }

    @Test
    public void givenOneOneOneNumber_returnTrue() {
        boolean palindromeNum = palindrome.isPalindrome(111);
        assertEquals(true, palindromeNum);
    }

    @Test
    public void givenOneOneTwoNumber_returnFalse() {
        boolean palindromeNum = palindrome.isPalindrome(112);
        assertEquals(false, palindromeNum);
    }

    @Test
    public void givenOneZeroZeroOneNumber_returnTrue() {
        boolean palindromeNum = palindrome.isPalindrome(1001);
        assertEquals(true, palindromeNum);
    }


}
