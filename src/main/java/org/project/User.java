package org.project;

import java.util.Scanner;

public class User implements Payable {
    String name;
    int balance;
    int cash;
    VendingMachine machine;

    public User(String name, int balance, int cash) {
        this.name = name;
        this.balance = balance;
        this.cash = cash;
    }

    @Override
    public void setPayMethod(VendingMachine machine, PayMethod method) {
        int amount = -1;
        switch (method) {
            case PayMethod.cash:
                System.out.printf("자판기에 넣을 금액: ");
                Scanner scanner = new Scanner(System.in);
                String amountStr = scanner.next();
                amount = Integer.valueOf(amountStr);
                if (amount > cash) {
                    System.out.println("갖고 있는 현금보다 많은 금액을 넣을 수 없습니다.");
                    return;
                }
                cash -= amount;
                break;
            case PayMethod.card:
                amount = balance;
                balance = 0;
                break;
        }

        if (amount >= 0) {
            machine.setMethod(method, amount);
        }
    }

    @Override
    public boolean chooseItem(Product item) {
        if (machine.selectItem(item)) return true;
        return false;
    }
}
