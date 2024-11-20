package Lesson9;

public class Car {

    int z = 5;



    String color;
    String engine;
    public static int count;
    public static int a = 10;

    public Car (String color, String engine){
        count++;
        this.color = color;
        this.engine = engine;
    }

//    public void showColor(){
//        System.out.println("Цвет машины: " + color);
//    }
//
//    public void changeColor (String color3){
//        System.out.println("Цвет машины изменился");
//        int cena = 5000;
//        color = color3;
//        cena += 1000;
//    }

    void changeColor (String color){
        System.out.println(this.color);
    }

    public static void main(String[] args) {
        Car c = new Car("red", "V6");
        System.out.println(c.color);
        c.changeColor("black");
        System.out.println(c.color);
    }

}
