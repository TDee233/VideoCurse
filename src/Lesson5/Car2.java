package Lesson5;

public class Car2 {

    String color;
    String engine;
    int speed;

    int gaz(int skorost){
        speed+=skorost;
        return speed;
    }
    int tormoz(int skorost){
        speed-=skorost;
        return speed;
    }
    void showInfo(){
        System.out.println("cvet: " + color + " motor: " + engine + " skorost: " + speed);
    }
}

class Car2Test{
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.color = "white";
        c1.engine = "V6";
        c1.speed = 60;

        c1.showInfo();
        c1.gaz(20);
        c1.showInfo();
        c1.tormoz(50);
        c1.showInfo();
    }
}