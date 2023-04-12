package com.testing.javatests.util;

// import static org.junit.Assert.*;

import org.omg.SendingContext.RunTime;

public class StringUtilTest {

    //tavulador de main: psvm
    public static void main(String[] args) {

        assertEquals(StringUtil.repeat("Hola", 3),"HolaHolaHola");

    }

    private static void assertEquals(String actual, String expected) {

        if (!actual.equals(expected)) {
            //System.out.println("Error");
            throw new RuntimeException(actual + "is not equal to " + expected);
        }
    }
}