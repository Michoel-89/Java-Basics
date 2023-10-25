package vehicles;
public class Main {

    public static void main(String[] args){
        // static means that the class owns the method or variable

        Car car1 = new Car();
        Bike bike1 = new Bike();

        car1.go();
        bike1.stop();
        
        System.out.println(car1.doors);
        System.out.println(bike1.pedals);
    }

}
