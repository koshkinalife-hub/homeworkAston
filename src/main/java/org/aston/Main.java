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
        // true false для 7 задания
        System.out.println(isNegative(-13));
        System.out.println(isNegative(0));
        System.out.println(isNegative(94));
        // ввод строки несколько раз
        printString("Хоккейный сезон начался", 5);
        // вопрос о високосный ли год
        System.out.println(isYear (2000)); //на 400 делится
        System.out.println(isYear(1700)); //на 100
        System.out.println(isYear(2025));
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

    //пункт 7 домашки
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // пункт 8 домашки строка в несколько раз
    public static void printString (String str, int times) {
        for (int i = 0; i< times; i++) {
            System.out.println(str);
        }
    }
    // пункт 9 домашки
    public static boolean isYear (int year) {
        // делится на 400 = високосный/сначала проверка на 400,100,4 чтобы не сбить логичку!
        if (year % 400 == 0) {
            return true;
        }
        // делится на 100 = не високосный
        if (year % 100 == 0) {
            return false;
        }
        // делится на 4 = високосный
        if (year % 4 == 0 ){
            return true;
        }
        // все остальные года не високосные
       else return false;
    }
    }