package com.testing.javatests.util;

// import static org.junit.Assert.*;

public class StringUtilTest {

    //tavulador de main: psvm
    public static void main(String[] args) {

        String result = StringUtil.repeat("Hola", 3);
        //tavulador de imprimir: sout
        System.out.println(result);
        //verificacion
        if (result.equals("HolaHolaHola")) {
            System.out.println("Ok");
        }

        String result2 = StringUtil.repeat("Hola2", 3);
        //verificacion
        System.out.println(result2);
        if (result.equals("Hola2Hola2Hola2")) {
            System.out.println("Ok");
        }

    }
}