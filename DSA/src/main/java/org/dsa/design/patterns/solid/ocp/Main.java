package org.dsa.design.patterns.solid.ocp;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2,3);
        AreaCalculator areaCalculator = new AreaCalculator();
        System.out.println(areaCalculator.calculateArea(rectangle));
    }
}
