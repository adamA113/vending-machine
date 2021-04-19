package com.vendingmachine;

public interface CalculatorInterface {
    int calculateTotal(CoinBundle enteredCoins);
    CoinBundle calculateChange(int enteredByUserMoney);
}
