import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("Duck");
        animals.add("Cow");
        
        for(String i : animals) {
            System.out.println(i);
        }
    }
}
