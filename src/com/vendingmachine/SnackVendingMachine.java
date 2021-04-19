package com.vendingmachine;

public class SnackVendingMachine implements VendingMachineInterface {

    private VendingMachineControllerInterface controller = new SnackVendingMachineController();
    private int selectedProduct;
    private CoinBundle change;

    @Override
    public void displayProducts() {
        System.out.println(" ===========================================");
        System.out.println("     WELCOME TO THE SNACK MACHINE           ");
        System.out.println(" ===========================================");
        System.out.println("         Current Available Products :         ");
        System.out.println("                                              ");
        for(Product product: Product.values()){
            if(!Product.INVALID.equals(product)) {
                System.out.println("     " + product.getSelectionTag() + "  " + product.name() + " - Price: " + product.getPrice() + "   ");
            }
        }
        System.out.println("                                              ");
        System.out.print(" Please select your product by choosing the tag left to it: ");

    }

    @Override
    public void selectProduct(int product) throws Exception {
        //enter the product tag
        this.selectedProduct = product;

        //check if the product tag is valid
        ProductStatus status = new ProductStatus(selectedProduct);
        if(status.product == Product.INVALID) {
            System.out.println(" Product tag is " + status.product);
            System.out.println(" Please enter a valid product tag");
            throw new Exception("INVALID product tag");
        }
        else{
            System.out.println(" You choose " + status.product + ", price: " + status.product.getPrice() + " cents");
        }
    }

    @Override
    public void displayEnterCoinsMessage() {
        System.out.println(" Please enter coins as follows: ");
        System.out.println(" num of 10 cents coins,num of 20 cents coins,num of 50 cents coins,num of 100 cents coins, num of 20 bucks notes, num of 50 bucks notes  ");
        System.out.println("                                              ");
        System.out.println(" Example: If you would like to enter 2 ten cents coins: 2,0,0,0,0,0");
        System.out.print(" Please enter coins: ");

    }

    @Override
    public void enterCoins(int... coins) throws Exception {
        VendingMachineOrder order = new VendingMachineOrder(selectedProduct, coins);
        change = controller.calculateChange(order);

    }

    @Override
    public void returnChange() {
        System.out.println("                                              ");
        System.out.println("Your change is :"+ change.getTotal()+"cents split as follows: ");
        System.out.println("    50 bucks note: "+ change.number5000CentsCoins);
        System.out.println("    20 bucks note: "+ change.number2000CentsCoins);
        System.out.println("    100 cents coins: "+ change.number100CentsCoins);
        System.out.println("    50 cents coins: "+ change.number50CentsCoins);
        System.out.println("    20 cents coins: "+ change.number20CentsCoins);
        System.out.println("    10 cents coins: "+ change.number10CentsCoins);

    }
 }
