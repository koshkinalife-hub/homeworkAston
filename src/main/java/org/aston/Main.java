package org.aston;

public class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone 55", "13.01.2055", "Apple Inc.", "USA", 55555, false);
        productsArray[2] = new Product("Xiaomi 11", "18.05.2025", "Xiaomi", "China", 3333, false);
        productsArray[3] = new Product("Kia Sorento", "28.12.2024", "Kia Motors", "Korea", 88888, true);
        productsArray[4] = new Product("Hyundai 666", "13.03.2023", "Hyundai Motor", "Korea", 139999, true);

        for (Product product : productsArray) {
            product.printInfo();
        }
    }
}