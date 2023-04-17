package com.testing.javatests.discounts;

public class FizzBuzzPruebaStr {

    public static String getTotal(int n) {

        String respose = "";

        if (n % 3 == 0)  respose += "Fizz";
        if (n % 5 == 0)  respose += "Buzz";

        return respose;
    }
}
