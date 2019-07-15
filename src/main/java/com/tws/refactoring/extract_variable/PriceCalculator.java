package com.tws.refactoring.extract_variable;

public class PriceCalculator {

    public static final int QUALITY_MAX = 500;
    public static final double DISCOUNT_RATE = 0.05;
    public static final double SHIPPING_COST_RATE = 0.1;
    public static final double SHIPPING_COST_MAX = 100.0;

    double getPrice(int quantity, int itemPrice) {
        // Price consists of: base price - discount + shipping cost
        return quantity * itemPrice -
                Math.max(0, quantity - QUALITY_MAX) * itemPrice * DISCOUNT_RATE +
                Math.min(quantity * itemPrice * SHIPPING_COST_RATE, PriceCalculator.SHIPPING_COST_MAX);
    }
}
