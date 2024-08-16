package org.dsa.design.patterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape("SQUARE");
        shape.print();
    }
}
