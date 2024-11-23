package Homework.HW17;

public class HW17 {
    public void ravenstvo (StringBuilder sb1, StringBuilder sb2){

        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));
    }
    public static void main(String[] args) {
        HW17 tester = new HW17();
        tester.ravenstvo(new StringBuilder("qwer"), new StringBuilder("qwer"));
    }
}
