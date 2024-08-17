package org.dsa.design.patterns.behavioural.observer.example1;

import java.util.LinkedList;
import java.util.List;

/**
 * In this example, the Subject class maintains a list of observers and provides methods for attaching,
 * detaching, and notifying them. When the setMessage method is called, the Subject updates its internal state
 * and then notifies all observers of the change by calling their update methods.
 * The ConcreteObserver class implements the Observer interface and provides its own implementation of the update method.
 */
public class Observable {
    private final List<Observer> observers = new LinkedList<>();
    private String message; // what message need to send

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {   // notifyObservers is private access modifier, bcz internally used by another method
        for (Observer observer : observers) {
            observer.update(message); // updating/notifying all observers with message
        }
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}
