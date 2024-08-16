package org.dsa.design.patterns.creational.singleton;

public class EnumMain {
    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.SINGLETON;
        EnumSingleton singleton1 = EnumSingleton.SINGLETON;
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
        singleton1.show();

    }
}
