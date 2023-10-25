package twoDArrays;

public class TwoDArrays {
    public static void main(String[] args) {
        String[][] cars = new String[3][3];
        // arrays have to be the same data type in Java
        cars[0][0] = "Camaro1";
        cars[0][1] = "Camaro2";
        cars[0][2] = "Camaro3";
        cars[1][0] = "Camaro4";
        cars[1][1] = "Camaro5";
        cars[1][2] = "Camaro6";
        cars[2][0] = "Camaro7";
        cars[2][1] = "Camaro8";
        cars[2][2] = "Camaro9";

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.err.println(cars[i][j]);
            }
        }
    }
}
