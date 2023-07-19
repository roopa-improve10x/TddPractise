package com.improve10x.tddpractise.palindrome;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PalindromeTest {

    private Palindrome palindrome;

    @Before
    public void setUp() {
        palindrome = new Palindrome();
    }
    @Test
    public void nothing() {}

    @Test
    public void givenEmptyString_returnTrue() {
        boolean result = palindrome.isPalindrome("");
        assertEquals(true, result);
    }

    @Test
    public void givenNullValue_returnFalse() {
        boolean result = palindrome.isPalindrome(null);
        assertEquals(false, result);
    }

    @Test
    public void givenACharacter_returnTrue() {
        boolean result = palindrome.isPalindrome("a");
        assertEquals(true, result);
    }

    @Test
    public void givenAACharacters_returnTrue() {
        boolean result = palindrome.isPalindrome("aa");
        assertEquals(true, result);
    }

    @Test
    public void givenAbCharacters_returnFalse() {
        boolean result = palindrome.isPalindrome("ab");
        assertEquals(false, result);
    }

    @Test
    public void givenAbaCharacters_returnTrue() {
        boolean result = palindrome.isPalindrome("aba");
        assertEquals(true, result);
    }

    @Test
    public void givenAbaacabcCharacters_returnFalse() {
        boolean result = palindrome.isPalindrome("abaacaabc");
        assertEquals(false, result);
    }

    @Test
    public void givenMadam_returnTrue() {
        boolean result = palindrome.isPalindrome("MADAM");
        assertEquals(true, result);
    }
}
