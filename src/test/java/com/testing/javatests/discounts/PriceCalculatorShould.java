package com.testing.javatests.discounts;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.regex.Matcher;

import static org.junit.Assert.*;

public class PriceCalculatorShould {

    // total zero when there are prices  -  cero total cuando hay precios
    @Test
    public void total_zero_when_there_are_prices() {

        PriceCalculator calculador = new PriceCalculator();

        assertThat(calculador.getTotal(), CoreMatchers.is(0.0));
    }

    // total is the sum of prices - el total es la suma de los precios
    @Test
    public void total_is_the_sum_of_prices() {

        PriceCalculator calculator = new PriceCalculator();

        calculator.addPrice(10.2);
        calculator.addPrice(15.5);

        assertThat(calculator.getTotal(), CoreMatchers.is(25.7));

    }


    // apply discount to prices  -  aplicar descuento a los precios
    @Test
    public void apply_discount_to_prices () {

        PriceCalculator calculator = new PriceCalculator();

        calculator.addPrice(12.5);
        calculator.addPrice(17.5);

        calculator.setDiscoiunt(50);

        assertThat(calculator.getTotal(), CoreMatchers.is(15.00));

    }

}