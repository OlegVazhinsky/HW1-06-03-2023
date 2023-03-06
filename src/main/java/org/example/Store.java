package org.example;

import java.util.ArrayList;

public class Store {
    private ArrayList<Product> storage = new ArrayList<>();

    public Store(){

    }

    public Store(ArrayList<Product> storage) {
        this.storage = storage;
    }

    public ArrayList<Product> getStorage() {
        return storage;
    }

    public void setStorage(ArrayList<Product> storage) {
        this.storage = storage;
    }

    public void addProduct(Product product){
        this.storage.add(product);
    }

    public void deleteProduct(Product product){
        this.storage.remove(product);
    }
}
