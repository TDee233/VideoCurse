package Homework.HW17;

public class HW17 {

//    public static boolean ravenstvo1 (StringBuilder sb1, StringBuilder sb2){
//        boolean result = true;
//        if (int i = 0; i < sb2.length(); i++) {
//            for (i =0; i < sb2.length(); i++) {
//                if (sb1.charAt(i) != sb2.charAt(i)) {
//                    result = false;
//                    break;
//                }
//            }
//        } else {
//            result = false;
//        }
//        return result;
//    }

    public void ravenstvo (StringBuilder sb1, StringBuilder sb2){

        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));
        System.out.println(!sb1.equals(sb2));
    }
    public static void main(String[] args) {
        HW17 tester = new HW17();
        tester.ravenstvo(new StringBuilder("qwer"), new StringBuilder("qwer"));

        HW17 tester1 = new HW17();
        tester1.ravenstvo(new StringBuilder("QWER"), new StringBuilder("qwer"));

//        StringBuilder sbb1 = new StringBuilder("Hello");
//        StringBuilder sbb2 = new StringBuilder("Hello");
//
//        boolean a = ravenstvo1(sbb1, sbb2);
//
//        System.out.println(a);
    }
}
