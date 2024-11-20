package Lesson16;

public class TestTG {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        x = x ^ y ^ (y = x);
        System.out.println(x + " " + y);
    }
}
