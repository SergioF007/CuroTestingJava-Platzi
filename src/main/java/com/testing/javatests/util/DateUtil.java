package com.testing.javatests.util;

public class DateUtil {

    //is Leap Year -  es año bisiesto

    public static boolean isLeapYear(int year) {


        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);


    }

}
