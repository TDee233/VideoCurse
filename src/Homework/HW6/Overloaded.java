package Homework.HW6;

public class Overloaded {
    public static void main(String[] args) {
        OverloadedTest o1 = new OverloadedTest();
        o1.sum();
        o1.sum(1);
        o1.sum(2,6);
        o1.sum(4,6,8);

    }
}

class OverloadedTest{
    int a, b, c, e;
    int sum (int a1, int b1, int c1, int e1){
        a = a1;
        b = b1;
        c = c1;
        e = e1;
        System.out.println(a+b+c+e);
        return a+b+c+e;

    }
    int sum(int b1, int c1, int e1){
        b = b1;
        c = c1;
        e = e1;
        System.out.println(b+c+e);
        return b+c+e;
    }
    int sum(int c1, int e1){
        c = c1;
        e = e1;
        System.out.println(c+e);
        return c+e;
    }
    int sum(int e1){
        e = e1;
        System.out.println(e);
        return e;
    }

    int sum(){
        System.out.println(0);
        return 0;
    }
}
