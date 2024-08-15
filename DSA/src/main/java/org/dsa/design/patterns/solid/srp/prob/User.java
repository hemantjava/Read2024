package org.dsa.design.patterns.solid.srp.prob;

// Without SRP
public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void saveToDatabase() {
        // Code to save user to the database
    }

    public void sendEmail() {
        // Code to send an email
    }
}

