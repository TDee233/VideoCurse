package Homework.HW9;

public class Test3 {

    int a3 = 1;
    static int b3 = 2;

    void abc (int a3) {
        System.out.println(b3);
        System.out.println(a3);
        System.out.println(this.a3);
        System.out.println(Test3.b3);
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.abc(4);
    }

}
