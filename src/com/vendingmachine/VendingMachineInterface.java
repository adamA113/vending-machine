package com.vendingmachine;

public interface VendingMachineInterface {
    void displayProducts();

    void selectProduct(int product) throws Exception;

    void displayEnterCoinsMessage();

    void enterCoins(int... coins) throws Exception;

    void returnChange();

}
