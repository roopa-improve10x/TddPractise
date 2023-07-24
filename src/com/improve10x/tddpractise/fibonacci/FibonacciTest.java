package com.improve10x.tddpractise.fibonacci;

import com.improve10x.tddpractise.fibonacci.Fibonacci;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void nothing() {
    }

    /*0, 1, 1, 2, 3, 5, 8, ...
     * input -10  output -1
     * input 0  output 0
     * input 1 output 1
     * input 2 output 2
     * input 5 output 5 */

    @Test
    public void giveNegativeNumber_returnNegativeNumber() {
        Fibonacci fibonacci = new Fibonacci();
        int negativeFibonacci = fibonacci.findFibonacci(-10);
        assertEquals(-1, negativeFibonacci);
    }

    @Test
    public void giveZero_returnZero(){
        Fibonacci fibonacci = new Fibonacci();
        int zeroFibonacci = fibonacci.findFibonacci(0);
        assertEquals(-1, zeroFibonacci);
    }

    @Test
    public void giveOne_returnOne() {
        Fibonacci fibonacci = new Fibonacci();
        int oneFibonacci = fibonacci.findFibonacci(1);
        assertEquals(0, oneFibonacci);
    }

    @Test
    public void giveTwo_returnTwo() {
        Fibonacci fibonacci = new Fibonacci();
        int twoFibonacci = fibonacci.findFibonacci(2);
        assertEquals(1, twoFibonacci);
    }

    @Test
    public void giveThree_returnThree() {
        Fibonacci fibonacci = new Fibonacci();
        int threeFibonacci = fibonacci.findFibonacci(3);
        assertEquals(2, threeFibonacci);
    }

    @Test
    public void giveFour_returnFour() {
        Fibonacci fibonacci = new Fibonacci();
        int fourFibonacci = fibonacci.findFibonacci(4);
        assertEquals(3, fourFibonacci);
    }

    @Test
    public void giveFive_returnFive() {
        Fibonacci fibonacci = new Fibonacci();
        int fifthFibonacci = fibonacci.findFibonacci(5);
        assertEquals(3, fifthFibonacci);
    }
}
