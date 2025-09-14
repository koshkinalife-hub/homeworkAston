package org.aston;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // -----Задание 1----Животные---
        Dog dog = new Dog("Тузик");
        Cat[] cats = {
                new Cat("Фантик"),
                new Cat("Черныш"),
                new Cat("Снежок")
        };

        dog.run(300);
        dog.swim(8);

        cats[0].run(150);
        cats[0].swim(5);

        Bowl bowl = new Bowl(20);
        for (Cat cat : cats) {
            cat.eat(bowl, 10);
        }

        System.out.println("Остаток еды в миске: " + bowl.getFood());
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сыт: " + (cat.isFull() ? "да" : "нет"));
        }

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
        System.out.println("Всего собак: " + Dog.getDogCount());


        // -------Задание 2---Фигуры----
        System.out.println("Геометрические фигуры");
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(13, "Красный", "Белый"));
        shapes.add(new Rectangle(5, 9, "Черный", "Бордовый"));
        shapes.add(new Triangle(3, 4, 5, "Голубой", "Синий"));

        for (Shape s : shapes) {
            System.out.println(s.getClass().getSimpleName());
            System.out.println("Площадь: " + s.getArea());
            System.out.println("Периметр: " + s.getPerimeter());
            System.out.println("Цвет заливки: " + s.getFillColor());
            System.out.println("Цвет границы: " + s.getBorderColor());
            System.out.println("---");
        }
    }
}