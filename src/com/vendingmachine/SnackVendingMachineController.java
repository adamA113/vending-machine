package com.vendingmachine;

public class SnackVendingMachineController implements VendingMachineControllerInterface {

    private CalculatorInterface calculator = new Calculator();

    @Override
    public CoinBundle calculateChange(VendingMachineOrder order) throws Exception {
        int total = calculator.calculateTotal(order.enteredCoins);
        int totalChange = total - order.product.getPrice();
        if(totalChange < 0){
            System.out.println(" Insufficient amount of money");
            throw new Exception("Insufficient money");
        }
        return calculator.calculateChange(totalChange);
    }
}
