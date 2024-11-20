package VideoCurse;

public class Test7 {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        int c = 99;
        int d = 100;

        boolean e = a<b || ++c==d; // false || true
        System.out.println(e);
        System.out.println(c);

        int x = 10;
        int y = 5;
        System.out.println(x|y);

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = false;
        boolean b4 = false;
        System.out.println(b1^b2^b3^b4);
    }
}
