package com.improve10x.tddpractise.factorial;

public class Factorial {
    public int getFactorial(int n) {
        int fact = 1;
        if(n < 0) {
            return -1;
        } else if(n > 0) {
            for(int i = 1; i <= n; i++) {
                fact = fact * i;
            }
        }
        return fact;
    }
}
