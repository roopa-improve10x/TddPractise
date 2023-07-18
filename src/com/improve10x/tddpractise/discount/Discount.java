package com.improve10x.tddpractise.discount;

public class Discount {
    public int findDiscount(int originalPrice, int discountRate) {
        int finalPrize = 0;
        int discountAmount = 0;
        discountAmount = originalPrice * discountRate / 100;
        finalPrize = originalPrice - discountAmount;
        return finalPrize;
    }
}
