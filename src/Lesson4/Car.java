package Lesson4;

public class Car {
Car (String cvet, String motor){
    color = cvet;
    engine = motor;
}
    String color;
    String engine;


}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("yellow", "v4");



        System.out.println("Cvet: " + car1.color);

        System.out.println("Motor: " + car1.engine);
    }
}