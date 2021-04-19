package com.vendingmachine;
/*
import com.vendingmachine.TextVendingMachineInterface;
import com.vendingmachine.VendingMachineInterface;
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        VendingMachineInterface machineInterface = new SnackVendingMachine();

        machineInterface.displayProducts();

        String selectedProduct = scanner.nextLine();
        machineInterface.selectProduct(Integer.parseInt(selectedProduct));

        machineInterface.displayEnterCoinsMessage();

        String userEnteredCoins = scanner.nextLine();
        int[] enteredCoins = Coin.parseCoins(userEnteredCoins);
        machineInterface.enterCoins(enteredCoins);

        machineInterface.returnChange();
    }
}
