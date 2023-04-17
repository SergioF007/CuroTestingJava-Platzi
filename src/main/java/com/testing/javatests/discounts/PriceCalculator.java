package com.testing.javatests.discounts;

import java.util.ArrayList;
import java.util.List;

// Price Calculator - Claculadora de precios
public class PriceCalculator {


    private List<Double> prices = new ArrayList<>();
    private double discount;

    public double getTotal() {

        double result = 0;

        //itter - abreviacion de este tipo de for
        for (Double price : prices ) {
            result +=price;
        }

        return  result * ((100 - discount)/100);
    }

    public void addPrice(double price) {

        prices.add(price);
    }

    public void setDiscoiunt(double discount) {
        this.discount = discount;
    }
}
