package com.testing.javatests.util;

// import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.omg.SendingContext.RunTime;


public class StringUtilTest {

    //tavulador de main: psvm

    @Test
    public void testRepeat() {

        Assert.assertEquals("HolaHolaHola" , StringUtil.repeat("Hola", 3));
        Assert.assertEquals("Hola" , StringUtil.repeat("Hola2", 1));

    }


}