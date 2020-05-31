package L6.Birds;

public class Bird {
    int distanceFly = 1000;

    protected String name;
    protected String color;
    protected int age;

    public void voice(){
        System.out.println(name + " krya..kryaa...!");
    }
    public void fly() {
        System.out.println(name + " " + "пролетела " + distanceFly + " м");
    }

    public void info() {
        System.out.printf(" %s", name, color, age);
    }
}
