package org.dsa.design.patterns.behavioural.observer.example1;

public class Main {
    public static void main(String[] args) {
        final Observable observable = new Observable();

        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");
        Observer observer3 = new ConcreteObserver("Observer 3");

        observable.attach(observer1);
        observable.attach(observer2);
        observable.attach(observer3);

        observable.setMessage("Hello World!"); // notify all attached observers

        observable.detach(observer2);// detached 2nd observer from observers list
        System.out.println("=======================================");

        observable.setMessage("Goodbye World!");
    }
}