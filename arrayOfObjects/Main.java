package arrayOfObjects;
public class Main {

    public static void main(String[] args) {

        Food food1 = new Food("pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hotdog");
        
        Food[] refridgerator = {food1, food2, food3};

        System.out.println(refridgerator[0].name);
        System.out.println(refridgerator[1].name);
        System.out.println(refridgerator[2].name);
    }
}
