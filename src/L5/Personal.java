package L5;

public class Personal {
    private String name;
    private String position;
    private String email;
    private long numbTelefone;
    private int wages;
    private int age;

    public void info(){
        System.out.printf("Personal: %s %s %s %d %d %d \n", name, position, email, numbTelefone, wages, age);
    }

    public Personal(String name, String position, String email, long numbTelefone, int wages, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.numbTelefone = numbTelefone;
        this.wages = wages;
        this.age = age;
    }
    public void setName (String name) {
        this.name = name;
    }
    public String getName() {
        return name ;
    }
    public void setPosition (String position) {
        this.position = position;
    }
    public String getPosition() {
        return position ;
    }
    public void setEmail (String email) {
        this.email = email;
    }
    public String getEmail() {
        return email ;
    }
    public void setNumbTelefone (long numbTelefone) {
        this.numbTelefone = numbTelefone;
    }
    public long getNumbTelefone() {
        return numbTelefone;
    }
    public void setWages (int wages) {
        this.wages = wages;
    }
    public int getWages() {
        return wages;
    }
    public void setAge (int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
