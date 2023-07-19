package com.improve10x.tddpractise.intpalindrome;

public class Palindrome {
    public boolean isPalindrome(int num) {
        int originalNumber = num;
        int reverseNumber = 0;
        while (num > 0) {
            int remainder = num % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            num = num / 10;
        }
        if (originalNumber == reverseNumber) {
            return  true;
        }
        return false;
    }
}
