package com.improve10x.tddpractise.discount;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DiscountTest {

    @Test
    public void nothing() {}
    @Test
    public void givenZero_returnZero() {
        Discount discount = new Discount();
        int finalPrice = discount.findDiscount(0, 0);
        assertEquals(0,finalPrice);
    }

    @Test
    public void givenOne_returnOne() {
        Discount discount = new Discount();
        int finalPrice = discount.findDiscount(1, 1);
        assertEquals(1, finalPrice);
    }

    @Test
    public void givenFifteenFive_returnFifteen() {
        Discount discount = new Discount();
        int finalPrice = discount.findDiscount(15, 5);
        assertEquals(15, finalPrice);
    }

    @Test
    public void givenTwoValues_returnFinalPrice() {
        Discount discount = new Discount();
        int finalPrice = discount.findDiscount(1500, 50);
        assertEquals(750, finalPrice);
    }

    @Test
    public void givenTwoInputs_returnFinalPrice() {
        Discount discount = new Discount();
        int finalPrice = discount.findDiscount(89, 20);
        assertEquals(72, finalPrice);
    }

    @Test
    public void givenOriginalPriceDiscountRate_returnFinalPrice() {
        Discount discount = new Discount();
        int finalPrice = discount.findDiscount(100, 75);
        assertEquals(25, finalPrice);
    }
}
