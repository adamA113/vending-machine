package com.vendingmachine;

public class ProductStatus {
    public Product product;

    public ProductStatus (int selectedProduct){
        this.product = Product.valueOf(selectedProduct);
    }
}
