package org.project;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    int sales;
    Map<Product, Integer> items;
    PayMethod method;
    int amount;

    public VendingMachine() {
        this.sales = 0;
        items = new HashMap<>();
    }

//    public Product[] showProduct() {
//        items.forEach();
//    }

    public void addProduct(Product item, int num) {
        items.put(item, items.getOrDefault(item, 0) + num);
    }

    public boolean sellProduct(Product item, int num) {
        if (items.getOrDefault(item, 0) == 0) return false;

        sales += item.getPrice();
        items.put(item, items.getOrDefault(item, 0) - 1);
        return true;
    }

    public void setMethod(PayMethod method, int amount) {
        this.method = method;
        this.amount = amount;
    }

    public boolean selectItem(Product item) {
        if (item.getPrice() > amount) return false;

        amount -= item.getPrice();
        return true;
    }
}
