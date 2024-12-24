package org.project;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    String name;
    int sales;
    Map<Product, Integer> items;

    public VendingMachine(String name) {
        this.name = name;
        this.sales = 0;
        this.items = new HashMap<>();
    }

    public void showItems() { this.showItems(0); }

    public void showItems(int amount) {
        System.out.println("\n" + name + " (●: 구매 가능 / ○: 구매 불가능 / ×: 재고 없음)");
        items.forEach((item, num) -> {
            String stock;
            if (num <= 0) {
                // 재고가 없는 경우
                stock = "×";
            } else if (amount < item.getPrice()) {
                // 금액이 부족한 경우
                stock = "○";
            } else {
                stock ="●";
            }
            System.out.printf(" %s  %s - %d원\n", stock, item.getName(), item.getPrice());
        });
    }

    public void addItems(Product item, int num) {
        items.put(item, items.getOrDefault(item, 0) + num);
    }

    public int getSales() {
        return sales;
    }
}
