package Homework;

public class HW4 {
}

class Student {
    int id, year;
    String name, surname;
    double math, economy, eng, sA;

    double grade (){
        sA = (math + economy + eng) / 3;
        System.out.println(sA);
        return sA;
    }
}

class StudentTest {

        public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1;
        s1.year = 2000;
        s1.name = "Ivan";
        s1.surname = "Petrov";
        s1.math = 4.5;
        s1.economy = 4;
        s1.eng = 5;


        Student s2 = new Student();
        s2.id = 2;
        s2.year = 2005;
        s2.name = "Pavel";
        s2.surname = "Ivanov";
        s2.math = 5.0;
        s2.economy = 4.5;
        s2.eng = 3;
        s2.sA = (s2.math + s2.economy + s2.eng)/3;

        Student s3 = new Student();
        s3.id = 3;
        s3.year = 2008;
        s3.name = "Stepan";
        s3.surname = "Sizov";
        s3.math = 3.2;
        s3.economy = 5;
        s3.eng = 4;
        s3.sA = (s3.math + s3.economy + s3.eng)/3;

        System.out.println("Sredniy ball 1 studenta - " + s1.grade());
        System.out.println("Sredniy ball 2 studenta - " + s2.sA);
        System.out.println("Sredniy ball 3 studenta - " + s3.sA);

        s1.grade();
        s2.grade();
        s3.grade();
    }
}