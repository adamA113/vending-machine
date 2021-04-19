package com.vendingmachine;

public interface VendingMachineControllerInterface {
    CoinBundle calculateChange(VendingMachineOrder order) throws Exception;
}
