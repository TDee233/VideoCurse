package Lesson16;

    public class Test2 {


        public static void main(String[] args) {
            String s1 = new String("privet");

//            String s10 = s1.substring(3);
//            System.out.println(s10);
//
//            String s11 = s1.substring(3,7);
//            System.out.println(s11);
//
//            String s12 = s1.trim();
//            System.out.println(s12);
//
//            String s13 = s1.substring(3,11);
//            System.out.println(s13);

            String s14 = s1.replace('o', 'Z');
            System.out.println(s14);

            String s15 = s1.replace("vet", "vivka");
            System.out.println(s15);

            String s2 = "poka";
            String s3 = s2.replace("k", "k");
            System.out.println(s14==s1);

            String s5 = "Privet, ";
            String s6 = "drug";
            System.out.println(s5.concat(s6));



        }
    }
