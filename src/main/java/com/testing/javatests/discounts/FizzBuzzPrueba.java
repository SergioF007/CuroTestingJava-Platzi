package com.testing.javatests.discounts;

public class FizzBuzzPrueba {

    public enum Response {
        Fizz, Buzz, FizzBuzz

    }
    public static Response getTotal(int num) {

        if ((num % 3 == 0) && (num % 5 != 0 )) {

            return Response.Fizz;
        } else if ((num % 5 == 0) && (num % 3 != 0)) {

            return  Response.Buzz;
        } else if ((num % 3 == 0) && (num % 5 == 0)) {

            return  Response.FizzBuzz;
        }

        return null;
        
    }
}
