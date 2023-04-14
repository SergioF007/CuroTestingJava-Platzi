package com.testing.javatests.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtil2Test {

    @Test
    public void text_with_content() {

        assertFalse(StringUtil2.isEmpty("Hola"));

    }

    @Test
    public void empty_text() {

        assertTrue(StringUtil2.isEmpty(""));

    }

    @Test
    public void text_with_empty_spaces() {

        assertTrue(StringUtil2.isEmpty(" "));
    }


    @Test
    public void nulltext() {

        assertTrue(StringUtil2.isEmpty(null));
    }
}