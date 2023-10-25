package superclass;
public class Hero extends Person {
    String power;

    Hero(String name, String power, int age) {
        super(name, age);
        this.power = power;
    }

    public String toString() {
        return super.toString()+this.power;
    }

}
