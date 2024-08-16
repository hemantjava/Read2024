package org.dsa.design.patterns.structural.adaptor.example1.adaptee;

public class WeightInPoundImpl implements WeightInPound {

    private double pounds;

    @Override
    public double getWeightInPounds() {
        return pounds;
    }

    @Override
    public void setWeightInPounds(double pounds) {
        this.pounds = pounds;
    }
}
