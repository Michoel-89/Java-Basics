public class DataOperations {
    public static void main(String[] args) {

        int number = 42;
        double pi = 3.14159;
        char grade = 'A';
        boolean isJavaFun = true;

        int result1 = number + 2;
        double result2 = pi * 2;
        char newGrade = (char) (grade + 1);
        boolean theGiantsSuck = isJavaFun;

        System.out.println("number " + result1);
        System.out.println("double " + result2);
        System.out.println("new grade " + newGrade);
        System.out.println("NYG stinks " + theGiantsSuck);
    }
}