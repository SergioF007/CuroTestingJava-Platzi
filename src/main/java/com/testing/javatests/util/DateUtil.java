package com.testing.javatests.util;

public class DateUtil {

    //is Leap Year -  es año bisiesto

    public static boolean isLeapYear(int year) {


        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ) {
            return true;
        } else {
            return false;
        }


    }

}
