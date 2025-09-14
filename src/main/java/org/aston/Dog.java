package org.aston;

public class Dog extends Animal {
    private static int dogCount=0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }


    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(getName() + " пробежал " + distance + " м.");
        } else {
            System.out.println(getName() + " не может бегать так далеко");
        }
    }


    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(getName() + " проплыл " + distance + " м.");
        } else {
            System.out.println(getName() + " не умеет плавать так далеко");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}
