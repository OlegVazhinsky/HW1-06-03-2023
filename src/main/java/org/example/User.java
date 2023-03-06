package org.example;

/*
4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
 */

public class User {
    private String login;
    private String password;
    private Basket userBasket;

    public User() {
    }

    public User(String login, String password, Basket userBasket) {
        this.login = login;
        this.password = password;
        this.userBasket = userBasket;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getUserBasket() {
        return userBasket;
    }

    public void setUserBasket(Basket userBasket) {
        this.userBasket = userBasket;
    }

    public void buyProduct(Product product) {
        this.userBasket.addProductToBasket(product);

    }

}
