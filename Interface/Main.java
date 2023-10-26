package Interface;

public class Main {
    public static void main(String[] args) {
        // Your Java code goes here
    Rabbit rabbit = new Rabbit();
    Hawk hawk = new Hawk();
    Fish fish = new Fish();

    fish.flee();
    hawk.hunt();
    rabbit.flee();
    }
}
