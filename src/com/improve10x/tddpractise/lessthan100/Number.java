package com.improve10x.tddpractise.lessthan100;

public class Number {
    public boolean isLessThan100(int a, int b) {
        int sum = a+b;
        if(sum > 100) {
            return false;
        } else if(sum <= 100) {
            return true;
        }
        return false;
    }
}
