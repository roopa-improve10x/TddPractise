package com.improve10x.tddpractise.twomakesten;

public class MakesTen {
    public boolean makesTen(int a, int b) {
        boolean result = false;
        int sum = a + b;
        if(sum == 10) {
            result = false;
        } else if(sum == a || sum == b) {
            result = true;
        }
        return result;
    }
}
