package com.improve10x.tddpractise.nthevennumber;

public class EvenNumber {

    public int findNthEvenNumber(int num) {
        int nthEvenNumber = 0;
        if(num == 0) {
            return 1;
        } else if(num < 0 ) {
            return  -1;
        } else if(num > 0) {
            nthEvenNumber = 2 * num - 2;
            return nthEvenNumber;
        }
        return nthEvenNumber;
    }
}
