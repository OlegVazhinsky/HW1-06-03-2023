package org.example;

/*
3)Создать класс Basket, содержащий массив купленных товаров.
 */

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> productArray = new ArrayList<Product>();

    public Basket() {
    }

    public Basket(ArrayList<Product> productArray) {
        this.productArray = productArray;
    }

    public ArrayList<Product> getProductArray() {
        return productArray;
    }

    public void setProductArray(ArrayList<Product> productArray) {
        this.productArray = productArray;
    }

    public void addProductToBasket(Product product) {
        this.productArray.add(product);
    }

    public void deleteProductFromBasket(Product product) {
        this.productArray.remove(product);
    }
}
