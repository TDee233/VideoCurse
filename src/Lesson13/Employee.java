package Lesson13;

public class Employee {

    public static void main(String[] args) {

        int denNedeli = 1;
        final int a = 10;
        final int b = 2;

        switch (denNedeli) {
            case 1 :
            case 2:
            case a * b:
            case 4:
            case 5:
                System.out.println("Rabbota do 18-00");
                break;
            case 6:
                System.out.println("Rabota do 14-00");
                break;
            case 7 :
                System.out.println("Raboti net");
                break;
            default:
                System.out.println("Takogo dnya net");
                break;
        }
    }

}
