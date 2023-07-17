package com.improve10x.tddpractise.farmproblem;

public class Farm {
    public int countTotalLegs(int chickenLegs, int cowLegs, int pigLegs) {
        int totalLegs = chickenLegs * 2 + cowLegs * 4 + pigLegs * 4;
        return totalLegs;
    }
}
