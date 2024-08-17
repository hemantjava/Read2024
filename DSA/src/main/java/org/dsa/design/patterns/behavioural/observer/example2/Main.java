package org.dsa.design.patterns.behavioural.observer.example2;

public class Main {
    public static void main(String[] args) {
        Observable observable = new ObservableImpl();

        Observer octa = new ObserverImpl("octa");
        Observer hexa = new ObserverImpl("hexa");
        Observer binary = new ObserverImpl("binary");

        observable.attach(octa);
        observable.attach(hexa);
        observable.attach(binary);
        System.out.println("----------------after all observers-------------");
        observable.setNum(10);
        observable.detach(binary);
        System.out.println("----------------after detach binary observer-------------");
        observable.setNum(10);

    }
}
