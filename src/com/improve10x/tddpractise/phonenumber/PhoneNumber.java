package com.improve10x.tddpractise.phonenumber;

public class PhoneNumber {
    public String getPhoneNumber(int[] number) {
        String formatPhoneNumber = "";
        if(number.length < 10) {
            return Integer.toString(-1);
        } else if(number.length == 10) {
            formatPhoneNumber = "(" + number[0] + number[1] + number[2] + ")" + " " + number[3] +
                    number[4] + number[5] + "-" + number[6] + number[7] + number[8] + number[9];
        }
        return formatPhoneNumber;
    }
}
