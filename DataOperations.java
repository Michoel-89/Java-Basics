import java.util.Arrays;
import javax.swing.JOptionPane;

public class DataOperations {
    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }
    public static String swap(String str1, String str2) {
        String temp;
        temp = str1;
        str1 = str2;
        str2 = temp;
        return "string 1: "+str1 + "\nstring 2: "+str2;
    }
    public static void main(String[] args) {

        int number = 42;
        double pi = 3.14159;
        char grade = 'A';
        boolean isJavaFun = true;

        int result1 = number + 2;
        double result2 = pi * 2;
        char newGrade = (char) (grade + 1);
        boolean theGiantsSuck = isJavaFun;

        int[] intArray = {1, 2, 3, 4};

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        Person p1 = new Person("john");
        
        
        System.out.println(DataOperations.divide(10, 2));
        System.out.println(DataOperations.multiply(10, 2));
        System.out.println(DataOperations.add(10, 2));
        System.out.println(DataOperations.subtract(10, 2));
        System.out.println(swap("Brian", "Daboll"));
        System.out.println(Arrays.toString(intArray));
        System.out.println("number " + result1);
        System.out.println("double " + result2);
        System.out.println("new grade " + newGrade);
        System.out.println("NYG stinks " + theGiantsSuck);
    }
}
