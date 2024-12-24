package org.project;

public class Manager extends User {
    private String key;

    public Manager(String key) {
        this.key = key;
    }

    public void addItems(VendingMachine machine, Product item, int num) {
        machine.addItems(item, num, key);
    }

    public void chechkSalse(VendingMachine machine) {
        int sale = machine.getSales(key);

        if (sale < 0) {
            System.out.println("열쇠가 일치하지 않습니다.");
        }
    }
}
