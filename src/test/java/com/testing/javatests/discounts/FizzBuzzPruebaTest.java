package com.testing.javatests.discounts;

import org.junit.Test;

import static com.testing.javatests.discounts.FizzBuzzPrueba.Response.*;



import static org.junit.Assert.*;

public class FizzBuzzPruebaTest {

    @Test
    public void es_fizz_si_num_es_div_por_3() {

        assertEquals(Fizz, FizzBuzzPrueba.getTotal(6));
    }

    @Test
    public void es_fizz_si_num_es_div_por_5() {

        assertEquals(Buzz, FizzBuzzPrueba.getTotal(10));
    }

    @Test
    public void es_fizzbuzz_si_num_es_div_por_5_y_2() {

        assertEquals(FizzBuzz, FizzBuzzPrueba.getTotal(30));
    }

}