package Homework.HW9;

public class Test2 {

    int a2 = 1;
    static int b2 = 2;

    static void abc (final int a2){
        System.out.println(a2);
        System.out.println(Test2.b2);
    }

    public static void main(String[] args) {
        abc(5);
    }

}
