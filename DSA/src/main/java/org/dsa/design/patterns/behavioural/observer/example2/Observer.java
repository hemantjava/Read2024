package org.dsa.design.patterns.behavioural.observer.example2;

/**
 * The Observer Design Pattern is a behavioral design pattern that defines a one-to-many dependency between objects,
 * so that when one object changes state, all its dependents are notified and updated automatically.
 * In other words, it is a design pattern that allows one or more objects (observers) to be notified
 * when the state of another object (the subject) changes.In this pattern, the subject maintains a list of its
 * dependents (observers), and when its state changes, it notifies all its observers automatically.
 * This allows the observers to update themselves based on the new state of the subject without having
 * to be explicitly told what has changed.
 */
public interface Observer {
    void update(int num); //Observing int value
}
