package org.aston;

public class Park {
    String name;

    public Park(String name) {
        this.name = name;
    }

    // Внутренний класс "атттракцион"
    class Attraction {
        String attractionName;  //названия
        String workingHours;    //рабочие часы
        int price;              //цены

        public Attraction(String attractionName, String workingHours, int price) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Аттракцион: " + attractionName);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Цена: " + price + " руб.");
            System.out.println("---Я строка разделения---");
        }
    }
}
//