package Lesson8;

import java.util.Arrays;

public class Car {
    String color = "Blue";
    String engine = "V6";
}

class Human {
    String name = "Ivan";
    Car c = new Car();

    public static void main(String[] args) {
        Human h1 = new Human();
        h1.c = new Car();
        h1.c = new Car();
        h1.c.engine = "V8";
        h1.c.color = "Red";

//        int [] array = {22,4,5,6};
//        int [] copy = Arrays.copyOfRange(array, 1, 3);
//        System.out.println(Arrays.toString(copy));
    }
}

