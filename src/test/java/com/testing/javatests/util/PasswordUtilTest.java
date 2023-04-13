package com.testing.javatests.util;

import org.junit.Test;

import static com.testing.javatests.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_thon_8_letters() {

         assertEquals(WEAK ,PasswordUtil.assessPassword("1234567"));

    }

    @Test
    public void weak_when_has_only_letters() {

        assertEquals(WEAK, PasswordUtil.assessPassword("abcdefg"));
    }

    @Test
    public void medium_when_has_letters_and_numbers() {

        assertEquals(MEDIUM, PasswordUtil.assessPassword("abcde12345"));
    }

    @Test
    public void medium_when_has_letters_numbers_and_symbols() {

        assertEquals(STRONG, PasswordUtil.assessPassword("abcde12345!"));

    }
}