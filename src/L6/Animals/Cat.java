package L6.Animals;

import L6.Animals.Animal;

public class Cat extends Animal {
    int distanceJump = 2;
    int distanceRun = 150;
    boolean distanceSwim = false;


    public Cat(String name, String color, int age) {
        super(name, color, age);
    }
    public void voice(){

        System.out.println(name + " mrrr...");
    }
    public void swim(){
        System.out.println(name + " " + "проплыл " + distanceSwim + " м");
        System.out.println(name + " " +" не может плавать");

    }
    public void run() {
        System.out.println(name + " " + "пробежал " + distanceRun + " м");
    }
    public void jump() {
        System.out.println(name + " " + "прыгнул на " + distanceJump + " м");
    }
}
