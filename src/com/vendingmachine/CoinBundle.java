package com.vendingmachine;

public class CoinBundle {
    public int number10CentsCoins;
    public int number20CentsCoins;
    public int number50CentsCoins;
    public int number100CentsCoins;
    public int number2000CentsCoins;
    public int number5000CentsCoins;

    public CoinBundle(int... enteredCoins) {
        this.number10CentsCoins = enteredCoins[0];
        this.number20CentsCoins = enteredCoins[1];
        this.number50CentsCoins = enteredCoins[2];
        this.number100CentsCoins = enteredCoins[3];
        this.number2000CentsCoins = enteredCoins[4];
        this.number5000CentsCoins = enteredCoins[5];

    }

    public int getTotal(){
        int total = 0;
        total = total + this.number10CentsCoins * Coin.TEN_CENTS.getValue();
        total = total + this.number20CentsCoins * Coin.TWENTY_CENTS.getValue();
        total = total + this.number50CentsCoins * Coin.FIFTY_CENTS.getValue();
        total = total + this.number100CentsCoins * Coin.HUNDRED_CENTS.getValue();
        total = total + this.number2000CentsCoins * Coin.TWENTY_BUCKS.getValue();
        total = total + this.number5000CentsCoins * Coin.FIFTY_BUCKS.getValue();
        return total;
    }
}
