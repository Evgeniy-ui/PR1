package L6.Animals;

public class Cat2 extends Cat{
    int distanceJump = 3;
    int distanceRun = 80;
    double distanceSwim = 1.1;


    public Cat2(String name, String color, int age) {
        super(name, color, age);
    }
    public void voice(){
        System.out.println(name + " mrrryy...");
    }

    public void swim(){
        System.out.println(name + " " + "проплыл " + distanceSwim + " м");
    }
    public void run() {
        System.out.println(name + " " + "пробежал " + distanceRun + " м");
    }
    public void jump() {
        System.out.println(name + " " + "прыгнул на " + distanceJump + " м");
    }


}
