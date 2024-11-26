package Homework.HW17;

public class Substr1 {
    public void isEqual (StringBuilder sb1, StringBuilder sb2){

        System.out.println(sb1==sb2);
        boolean areEqual = sb1.toString().compareTo(sb2.toString()) == 0;
        System.out.println(areEqual);
    }
    public static void main(String[] args) {
        Substr1 tester = new Substr1();
        tester.isEqual(new StringBuilder("qwer"), new StringBuilder("qwer"));
    }
}
