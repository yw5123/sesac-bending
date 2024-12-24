package org.project;

public class Drink extends Product {
    int capacity;
    boolean isHot;

    public Drink(String name, int price, int capacity, boolean isHot) {
        super(name, price);
        this.capacity = capacity;
        this.isHot = isHot;
    }
}
