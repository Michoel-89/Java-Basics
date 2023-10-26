package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // Your Java code goes here
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("enter a whole number to divide");
            int x = scanner.nextInt();

            System.out.println("enter a whole number to divide by");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.println("result " + z);
        }
        catch(ArithmeticException e) {
            System.out.println("you can't divide by 0!");
        }
        catch(InputMismatchException e) {
            System.out.println("please enter a number");
        }
        catch(Exception e) {
            System.out.println("something went wrong");
        }
        finally {
            System.out.println("this will always print");
            scanner.close();
        }
    }

}
