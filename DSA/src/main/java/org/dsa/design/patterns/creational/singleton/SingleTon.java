package org.dsa.design.patterns.creational.singleton;

public final class SingleTon {

    private static SingleTon single;

    private SingleTon() {

    }

    public static SingleTon getInstance() {
        if (single == null) {
            single = new SingleTon();
        }
        return single;
    }
}