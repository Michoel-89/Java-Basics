public class Greeting {
    public static void greet(String name) {
        if (name != null) {
            System.out.println("Hello, " + name);
        } else {
            System.out.println("Hello, World");
        }
    }

    public static void main(String[] args) {
        greet("John"); // call the greet function
    }
}
