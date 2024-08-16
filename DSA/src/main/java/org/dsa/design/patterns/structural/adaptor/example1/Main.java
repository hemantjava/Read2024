package org.dsa.design.patterns.structural.adaptor.example1;

import org.dsa.design.patterns.structural.adaptor.example1.adaptee.WeightInPound;
import org.dsa.design.patterns.structural.adaptor.example1.adaptee.WeightInPoundImpl;
import org.dsa.design.patterns.structural.adaptor.example1.adapter.WeightInKg;
import org.dsa.design.patterns.structural.adaptor.example1.adapter.WeightInKgImpl;

public class Main {
    public static void main(String[] args) {
        WeightInPound weightInPound = new WeightInPoundImpl();
        weightInPound.setWeightInPounds(70);
        WeightInKg weightInKg = new WeightInKgImpl(weightInPound); //adapter class
        System.out.println(weightInKg.getWeightInKg());
    }
}
