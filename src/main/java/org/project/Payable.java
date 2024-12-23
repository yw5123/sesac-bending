package org.project;

public interface Payable {

    void setPayMethod(VendingMachine machine, PayMethod method);

    boolean chooseItem(Product item);
}
