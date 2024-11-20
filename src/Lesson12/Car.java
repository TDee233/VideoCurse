package Lesson12;

public class Car {

    int engine;
    int doorCount;

    Car (int engine, int doorCount){
        this.doorCount = doorCount;
        this.engine = engine;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car (1, 4);
        Car c2 = new Car (2, 5);

        if (c1.engine>c2.engine){
            if (c1.doorCount>c2.doorCount)
                System.out.println("Мощность мотора и количество дверей  у первой мааишны больше");
        }
            else
                System.out.println("Мощность у первой машины больше а количество дверей меньше");


    }
}