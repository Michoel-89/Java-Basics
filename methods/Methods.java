package methods;
public class Methods {

    public static void main(String[] args) {
        String name = "John";
        int age = 21;
        hello(name, age);

        System.out.printf("%d",age);
        // printf is for formatting
        System.out.println();
    }
    
    static void hello(String name, int age) {
        System.out.println("Hello "+ name + " You're "+age+ " years old");
    }
    // overloaded methods contain the same signature but take in different number, order, or types of values.
}
