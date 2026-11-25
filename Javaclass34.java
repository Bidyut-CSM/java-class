import java.util.Arrays;

public class Javaclass34 {
    public static void main(String[] args) {
        System.out.println("Java Class 34. Object Oriented Programming Java");
        Car car1 = new Car();

        car1.brand = "BMW";
        car1.color = "Black";
        car1.price = 5000000;

        System.out.println(car1.brand);
        System.out.println(car1.color);
        System.out.println(car1.price);

        car1.start();
        car1.Break();
        car1.stop();
    }
}

class Car {

    String brand;
    String color;
    int price;

    void start() {
        System.out.println("Car is starting..");
    }
    void Break() {
        System.out.println("break..");
    }
    void stop() {
        System.out.println("Car is stopping..");
    }
}
