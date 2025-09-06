package org.aston;

public class Main {

    public static void main(String[] args) {
        // Вызов методов без параметров
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumber();
        // вызов метода с параметрами
        boolean result = isSumWithinRange(18, 7);
        System.out.println("Результат: " + result);
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
public static boolean isSumWithinRange(int a, int b) {
     int sum = a + b;
     return sum >= 10 && sum <= 20;
    }
    }