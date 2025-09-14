package org.aston;

public class Cat extends Animal {
    private static int catCount;
    private boolean full;

    public Cat(String name) {
        super(name);
        catCount++;
        this.full = false;
    }


    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(getName() + " пробежал " + distance + " м.");
        } else {
            System.out.println(getName() + " не может бегать так далеко");
        }
    }


    public void swim(int distance) {
        System.out.println(getName() + " не умеет плавать");
    }

    public void eat(Bowl bowl, int foodAmount) {
        if (bowl.getFood() >= foodAmount) {
            bowl.decreaseFood(foodAmount);
            full = true;
        } else {
            full = false;
        }
    }

    public boolean isFull() {
        return full;
    }

    public static int getCatCount() {
        return catCount;
    }
}
