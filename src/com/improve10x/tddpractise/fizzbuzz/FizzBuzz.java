package com.improve10x.tddpractise.fizzbuzz;

public class FizzBuzz {

    public String findFizzBuzz(int n) {
        if(n > 0 && n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if(n > 0 && n % 5 == 0) {
            return "Buzz";
        } if(n > 0 && n % 3 == 0) {
            return "Fizz";
        }
      return String.valueOf(n);
    }
}
