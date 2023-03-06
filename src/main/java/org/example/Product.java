package org.example;

/*
1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
 */

public class Product {
    private String name;
    private double price;
    private double rank;
    private String categoryName;

    public Product() {
    }

    public Product(String name, double price, double rank) {
        this.name = name;
        this.price = price;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRank() {
        return rank;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
