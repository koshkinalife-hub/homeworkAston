package org.aston;

public class Main {

    public static void main(String[] args) {
        // Вызов методов
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumber();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

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
    public  static void printColor() {
        int value = 87;
                if (value <= 0) {
                    System.out.println("Красный");
                }
                else if (value > 0 && value <= 100) {
                    System.out.println("Жёлтый");
                }
                else {
                    System.out.println("Зелёный");
                }
                }
    public static void compareNumber() {
        int a = 33;
        int b = 26;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }

    }