package com.testing.javatests.util;

// import static org.junit.Assert.*;

import org.junit.Assert;
import org.omg.SendingContext.RunTime;


public class StringUtilTest {

    //tavulador de main: psvm
    public static void main(String[] args) {

        Assert.assertEquals("HolaHolaHola" , StringUtil.repeat("Hola", 3));
        Assert.assertEquals("Hola" , StringUtil.repeat("Hola2", 1));

    }


}