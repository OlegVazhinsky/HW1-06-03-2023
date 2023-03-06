package org.example;

/*
Домашнее задание на закрепление:

1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
3)Создать класс Basket, содержащий массив купленных товаров.
4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
5)Вывести на консоль каталог продуктов. (все продукты магазина)
6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Store myStore = new Store();

        User user1 = new User();
        user1.setLogin("Иван");
        user1.setPassword("12345");

        Basket basket1 = new Basket();
        user1.setUserBasket(basket1);

        User user2 = new User();
        user2.setLogin("Светлана");
        user2.setPassword("qwerty");

        User user3 = new User();
        user3.setLogin("Пётр");
        user3.setPassword("1q2w3e4r5t");

        Product keyboard1 = new Product();
        keyboard1.setName("A4Tech Fstyler FBX51C");
        keyboard1.setPrice(2999.0);
        keyboard1.setRank(55.0);
        keyboard1.setCategoryName("Клавиатура");

        myStore.addProduct(keyboard1);

        Product keyboard2 = new Product();
        keyboard2.setName("Jet.A Panteon T1 PRO");
        keyboard2.setPrice(2990.0);
        keyboard2.setRank(10.0);
        keyboard2.setCategoryName("Клавиатура");

        myStore.addProduct(keyboard2);

        Product keyboard3 = new Product();
        keyboard3.setName("Redragon Daksa");
        keyboard3.setPrice(2989.0);
        keyboard3.setRank(95.0);
        keyboard3.setCategoryName("Клавиатура");

        myStore.addProduct(keyboard3);

        Product computermouse1 = new Product();
        computermouse1.setName("Logitech M280");
        computermouse1.setPrice(1999.0);
        computermouse1.setRank(10.0);
        computermouse1.setCategoryName("Компьютерная мышь");

        myStore.addProduct(computermouse1);

        Product computermouse2 = new Product();
        computermouse2.setName("Logitech M330 SILENT PLUS");
        computermouse2.setPrice(1990.0);
        computermouse2.setRank(11.0);
        computermouse2.setCategoryName("Компьютерная мышь");

        myStore.addProduct(computermouse1);

        Product computermouse3 = new Product();
        computermouse3.setName("Logitech Pebble M350");
        computermouse3.setPrice(1980.0);
        computermouse3.setRank(86.0);
        computermouse3.setCategoryName("Компьютерная мышь");

        myStore.addProduct(computermouse1);

        Product monitor1 = new Product();
        monitor1.setName("MSI Pro MP242V");
        monitor1.setPrice(9999.0);
        monitor1.setRank(953.0);
        monitor1.setCategoryName("Монитор");

        myStore.addProduct(monitor1);

        Product monitor2 = new Product();
        monitor2.setName("HP V20");
        monitor2.setPrice(9990.0);
        monitor2.setRank(159.0);
        monitor2.setCategoryName("Монитор");

        myStore.addProduct(monitor2);

        Product monitor3 = new Product();
        monitor3.setName("Philips 223V5LSB2");
        monitor3.setPrice(9980.0);
        monitor3.setRank(72.0);
        monitor3.setCategoryName("Монитор");

        myStore.addProduct(monitor3);

        System.out.println("Список всех товаров:");
        System.out.println("_______________________________________________________");
        for (Product myProduct: myStore.getStorage()) {
            System.out.println("Наименование: " + myProduct.getName() + ".");
            System.out.println("Стоимость: " + myProduct.getPrice() + " руб.");
            System.out.println("Рейтинг: " + myProduct.getRank() + ".");
            System.out.println("Категория: " + myProduct.getCategoryName() + ".");
            System.out.println("_______________________________________________________");
        }
        System.out.println();

        user1.buyProduct(keyboard1);
        myStore.deleteProduct(keyboard1);

        System.out.println("Список всех товаров корзины покупателя: " + user1.getLogin());
        System.out.println("_______________________________________________________");
        for (Product myProduct: user1.getUserBasket().getProductArray()) {
            System.out.println("Наименование: " + myProduct.getName() + ".");
            System.out.println("Стоимость: " + myProduct.getPrice() + " руб.");
            System.out.println("Рейтинг: " + myProduct.getRank() + ".");
            System.out.println("Категория: " + myProduct.getCategoryName() + ".");
            System.out.println("_______________________________________________________");
        }
        System.out.println();

        System.out.println("Список всех товаров категории клавиатура:");
        System.out.println("_______________________________________________________");
        for (Product myProduct: myStore.getStorage()) {
            if (myProduct.getCategoryName() == "Клавиатура"){
                System.out.println("Наименование: " + myProduct.getName() + ".");
                System.out.println("Стоимость: " + myProduct.getPrice() + " руб.");
                System.out.println("Рейтинг: " + myProduct.getRank() + ".");
                System.out.println("Категория: " + myProduct.getCategoryName() + ".");
                System.out.println("_______________________________________________________");
            }
        }

    }
}