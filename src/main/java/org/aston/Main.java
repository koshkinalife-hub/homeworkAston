package org.aston;

public class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone 16", "01.09.2025", "Apple Inc.", "USA", 8999, false);
        productsArray[2] = new Product("Xiaomi Mi 15", "12.01.2025", "Xiaomi", "China", 3999, true);
        productsArray[3] = new Product("Sony TV", "15.03.2025", "Sony", "Japan", 4999, false);
        productsArray[4] = new Product("LG Fridge", "20.04.2025", "LG", "Korea", 2999, true);

        // Вывод информации о всех
        for (Product product : productsArray) {
            product.printInfo();
            System.out.println("------------");
        }
    }
}