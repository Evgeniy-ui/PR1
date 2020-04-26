package L6.Animals;

public class Animal {

    protected String name;
    protected String color;
    protected int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void jump(){
        System.out.println(name );
    }

    public void run(){

        System.out.println(name );
    }
    public void swim(){
        System.out.println(name );
    }

    public void voice(){ System.out.println(name + "   ");
    }

    public void sleep() {
        System.out.println(name + " sleep!");
    }

    public void info() {
        System.out.printf(" %s %s %s \n", name, color, age);

    }

}
