package org.aston;

public abstract class Animal {
    private String name;
    private static int animalCount=0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public String getName() {
        return name;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public void run(int distance){
        System.out.println(name + " пробежал " + distance + " м.");
    };
    public void swim(int distance){
        System.out.println(name + " проплыл " + distance + " м.");
    };
}