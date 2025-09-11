package org.aston;

public class ParkmMain {
    public static void main(String[] args) {
        // Создание парка
        Park park = new Park("Центральный парк");

        // Аттракционы
        Park.Attraction carousel = park.new Attraction("Каруселька", "12:00 - 22:00", 50);
        Park.Attraction zipline = park.new Attraction("Тросс", "8:00 - 16:00", 10);
        Park.Attraction drop = park.new Attraction("Башня падения", "21:00 - 23:00", 50);

        // Выводим
        System.out.println("Парк: " + park.name);
        carousel.printInfo();
        zipline.printInfo();
        drop.printInfo();
    }
}