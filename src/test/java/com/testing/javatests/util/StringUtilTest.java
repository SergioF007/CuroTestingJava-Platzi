package com.testing.javatests.util;

// import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.omg.SendingContext.RunTime;

public class StringUtilTest {
    //tavulador de main: psvm
    @Test
    public void repeat_string_one() {

        Assert.assertEquals("Hola" , StringUtil.repeat("Hola", 1));

    }
    @Test
    public void repeat_string_multiple_times() {
        Assert.assertEquals("HolaHolaHola" , StringUtil.repeat("Hola", 3));

    }
    @Test
    public void repeat_string_zero_times() {
        Assert.assertEquals("" , StringUtil.repeat("Hola", 0));

    }
}