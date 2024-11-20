package Homework.HW8;

public class HW8_1 {

    public static int umnozhenie(int a, int v, int c){
        return a*v*c;
    }

    public static void delenie (int f, int g){
        System.out.println("Деление числа: " + f + ", на число: " + g + " = " + f/g + " целых, и " + f%g + " десятых");
    }

}

class MethodUse {
    public static void main(String[] args) {

        System.out.println(HW8_1.umnozhenie(3,6,8));
        System.out.println(HW8_1.umnozhenie(6,10,5));

        HW8_1.delenie(10,5);
        HW8_1.delenie(55,33);



    }
}
