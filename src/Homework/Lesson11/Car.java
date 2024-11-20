package Homework.Lesson11;

public class Car {
    int doorCount;
    String name, color, motor;

    Car (String name, String color, String motor, int doorCount){
        this.name = name;
        this.color = color;
        this.motor = motor;
        this.doorCount = doorCount;
    }


}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Jaguar", "red", "V12", 5);
        Car car2 = new Car("BMW", "black", "V8", 3);

//        colorChange(car1, car2);
        doorChange(car1, 7);
        doorChange(car2,1);
        System.out.println(car1.doorCount);
        System.out.println(car2.doorCount);

        System.out.println("Название авто: " + car1.name + " | Цвет: " + car1.color + " | Мотор машины: " + car1.motor + " | Количество дверей: " + car1.doorCount);
        System.out.println("Название авто: " + car2.name + " | Цвет: " + car2.color + " | Мотор машины: " + car2.motor + " | Количество дверей: " + car2.doorCount);
    }

    public static void doorChange (Car car, int newDoorCount){
        car.doorCount = newDoorCount;
        System.out.println("Новое количество дверей у авто " + car.name + " - " + newDoorCount);
    }

    public static void colorChange (Car car1, Car car2) {
        String tempColor = car1.color;
        car1.color = car2.color;
        car2.color = tempColor;
        System.out.println("Цвет первой машины: " + car1.color);
        System.out.println("Цвет второй машины: " + car2.color);

    }

}
