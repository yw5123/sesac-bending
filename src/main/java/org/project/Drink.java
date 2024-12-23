package org.project;

public class Drink extends Product {
    int capacity;
    boolean isHot;

    public Drink(String name, int price, int stockQuantity, int capacity, boolean isHot) {
        super(name, price, stockQuantity);
        this.capacity = capacity;
        this.isHot = isHot;
    }
}
