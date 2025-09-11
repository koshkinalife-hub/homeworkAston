package org.aston;

public class Product {
    String name; //названия
    String productionDate; //даты
    String manufacturer; //производители
    String country; //страны
    int price; //цены
    boolean isBooked; //бронь есть или нет

    public Product(String name, String productionDate, String manufacturer,
                   String country, int price, boolean isBooked) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.isBooked = isBooked;
    }

    // Метод для вывода информации
    public void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна: " + country);
        System.out.println("Цена: " + price + " $");
        System.out.println("Забронирован: " + (isBooked ? "Да" : "Нет"));
    }
}