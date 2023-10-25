package methods;
public class StringMethods {
    public static void main(String[] args) {
        String name = "Michoel";

        boolean same = name.equals("John");
        boolean empty = name.isEmpty();
        String lower = name.toLowerCase();
        String replace = name.replace(name, "Elvis");
        System.out.println(replace);
    }
}
