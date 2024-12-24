package org.project;

public class Manager extends User {
    private VendingMachine machine;

    public Manager(VendingMachine machine) {
        this.machine = machine;
    }

    public void addItems(Product item, int num) {
        machine.addItems(item, num);
    }

    public void checkSales() {
        System.out.printf("지금까지의 매출액은 %d원입니다.\n", machine.getSales());
    }
}
