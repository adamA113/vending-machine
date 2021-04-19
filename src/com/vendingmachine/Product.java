package com.vendingmachine;

public enum Product {
    // first row containing 5 products
    DORITOS(11,2200), COKE(12,50), WATER(13,30), SANDWICH(14,150), SNICKERS(15,150), INVALID(0,0);

    // total number of rows is 5

    private int selectionTag;
    private int price;

    Product(int selectionTag, int price){
        this.selectionTag = selectionTag;
        this.price = price;
    }

    public int getSelectionTag(){
        return selectionTag;
    }

    public int getPrice(){
        return price;
    }

    public static Product valueOf(int numberSelection){
        for(Product product: Product.values()){
            if(numberSelection == product.getSelectionTag()){
                return product;
            }
        }
        return INVALID;
    }
}
