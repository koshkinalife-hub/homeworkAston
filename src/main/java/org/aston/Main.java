package org.aston;

public class Main {

    public static void main(String[] args) {
        // Вызов метода
        printThreeWords();
        // Сумма положительная или отрицательная выбор
        checkSumSign();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }


// Сумма отрицательная или положительная
public static void checkSumSign() {
    int a = -18;
    int b = 32;

    int sum = a + b;
    if (sum >= 0) {
    System.out.println("Сумма положительная");
    }
    else {
    System.out.println("Сумма отрицательная");
    }
    }
}