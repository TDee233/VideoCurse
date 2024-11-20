package Homework.HW16;

public class email {
String s1;
    public email(String s1) {
        this.s1 = s1;


//        if (s1.contains("yahoo")){
//                System.out.println("yahoo");
//            }
//        if (s1.contains("mail")) {
//            System.out.println("mail");
//        }
//        if (s1.contains("gmail")) {
//            System.out.println("gmail");
//        }


    }

    public static void main(String[] args) {
        String s11 = "ya@yahoo.com; on@mail.ru; ona@gmail.com; 1@yahoo.com; 2@gmail.com";
//        new email(s11);

        String domain = s11.substring(s11.indexOf('@',';')+1);
        System.out.println(domain);

    }

}
