package org.project;

public class Main {
    public static void main(String[] args) {
        // 음료 자판기 & 관리자 생성 및 상품 추가
        VendingMachine drinkMachine = new VendingMachine("음료 자판기");
        Product coke = new Drink("콜라", 1100, 200, false);
        Product oragejuice = new Drink("오렌지주스", 1800, 500, false);
        Product cocoa = new Drink("핫초코", 900, 120, true);

        Manager drinkManager = new Manager(drinkMachine);
        drinkManager.addItems(coke, 9);
        drinkManager.addItems(oragejuice, 7);
        drinkManager.addItems(cocoa, 19);

        // 과자 자판기 & 관리자 생성 및 상품 추가
        VendingMachine snackMachine = new VendingMachine("과자 자판기");
        Product twix = new Product("트윅스", 2000);
        Product chocolate = new Product("초콜릿", 1500);

        Manager snackManager = new Manager(snackMachine);
        snackManager.addItems(twix, 10);
        snackManager.addItems(chocolate, 3);

        drinkMachine.showItems();
        snackMachine.showItems();

    }
}
