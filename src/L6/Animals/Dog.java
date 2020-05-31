package L6.Animals;

import L6.Animals.Animal;

public class Dog extends Animal {
    double distanceJump = 0.5;
    int distanceRun = 500;
    int distanceSwim = 10;

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }
    public void voice() {
        System.out.println(name + " gav gav...");
    }

    public void run(){
        System.out.println(name + " " + "пробежал " + distanceRun + " м");
    }
    public void jump(){
        System.out.println(name + " " + "прыгнул на " + distanceJump + " м");
    }
    public void swim(){
        System.out.println(name + " " + "проплыл " + distanceSwim + " м");
    }
}

