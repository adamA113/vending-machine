package com.vendingmachine;

public class VendingMachineOrder {
    public Product product;
    public CoinBundle enteredCoins;

    public VendingMachineOrder(int selectedProduct, int... enteredCoins){
        this.product = Product.valueOf(selectedProduct);
        this.enteredCoins = new CoinBundle(enteredCoins);
    }
}
