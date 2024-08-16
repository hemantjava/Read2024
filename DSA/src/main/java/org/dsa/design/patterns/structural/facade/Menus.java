package org.dsa.design.patterns.structural.facade;

public class Menus {
    private String item;
    private Double price;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Menus(String item, double price){
        this.item = item;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Menu{" +
                "item='" + item + '\'' +
                ", price=" + price +
                '}';
    }
}
