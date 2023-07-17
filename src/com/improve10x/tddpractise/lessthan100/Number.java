package com.improve10x.tddpractise.lessthan100;

public class Number {
    public boolean isLessThan100(int a, int b) {
        boolean result = false;
        int sum = a + b;
        if(sum <= 100) {
            result = true;
        }
        return result;
    }
}
