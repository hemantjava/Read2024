package org.dsa.interview.immutable;

public class Address {
    private String city;
    private String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    // Getters
    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    // Setters (to show mutability, though in the immutable class, we avoid exposing this)
    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}