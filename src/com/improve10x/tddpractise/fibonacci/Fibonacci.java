package com.improve10x.tddpractise.fibonacci;

public class Fibonacci {
    public int find(int n) {
        if(n <= 0) {
            return -1;
        } else if(n == 1) {
            return 0;
        } else if(n == 2) {
            return 1;
        } else {
            return find(n-1) + find(n-2);
        }
    }
}
