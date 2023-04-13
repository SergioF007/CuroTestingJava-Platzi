package com.testing.javatests.util;

public class StringUtil {

    public static String repeat(String str,  int times) {


        // para validar el test para validar si el argumento es correcto

        if (times < 0) {
            throw new IllegalArgumentException("negative time not allowed");
        }

        String result = "";

        for (int i = 0; i < times; i++) {

            result += str;

        }

        return  result;
    }
}
