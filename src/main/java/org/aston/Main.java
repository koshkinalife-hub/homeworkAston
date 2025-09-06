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
        // проверка метода
        printnumberSign(0);
        printnumberSign(81);
        printnumberSign(-23);
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
// пункт 2 домашки
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
    // пункт 3 домашки
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

   //Пункт 4 дз
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
    // Пункт 5 домашки
public static boolean isSumWithinRange(int a, int b) {
     int sum = a + b;
     return sum >= 10 && sum <= 20;
    }
    // Пункт 6 Домашки
    public static void printnumberSign(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }
    }