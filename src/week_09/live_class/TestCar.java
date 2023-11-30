package week_09.live_class;

public class TestCar {
    public static void main(String[] args) {

        //created 2 object
        Car car = new Car();
        Car car2 = new Car();

        car.brand = "Ford";
        car2.brand = "Renault";

        car.model = "Focus";
        car2.model = "Megan";

        car.color = "black";
        car2.color = "grey";

        car.price = 120000;
        car2.price = 100000;

        car.printStates();
        car2.printStates();

        car.speed = 100; //initial speed
        car2.speed = 130; //initial speed

        car.speedUp(50);
        car2.speedUp(70);

        System.out.println("car speed: " + car.speed);
        System.out.println("car2 speed: " + car2.speed);

        System.out.println("----------------");

        car.applyBrakes(60);
        car2.applyBrakes(100);

        System.out.println("car speed: " + car.speed);
        System.out.println("car2 speed: " + car2.speed);



    }
}

