package org.project;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    int sales;
    Map<Product, Integer> items;
    String key;

    public VendingMachine(int sales, String key) {
        this.sales = sales;
        this.items = new HashMap<>();
        this.key = key;
    }

    public void showItems() {
        items.forEach((item, num) -> {
            String isSale = "●";
            if (num > 0) isSale = "○";
            System.out.println(isSale + " " + item.getName());
        });
    }

    public void addItems(Product item, int num, String key) {
        if (checkKey(key)) {
            items.put(item, items.getOrDefault(item, 0) + num);
        }
    }

    public int getSales(String key) {
        if (!checkKey(key)) {
            return -1;
        }

        return sales;
    }

    private boolean checkKey(String key) {
        return key.equals(this.key);
    }
}
