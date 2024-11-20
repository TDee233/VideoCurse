package Homework.HW6;

public class Student {
    int id, year;
    String name, surname;
    double math, economy, eng, sA;

    double grade (){
        sA = (math + economy + eng) / 3;
        System.out.println(sA);
        return sA;
    }

    Student (int id1, int year1, String name1, String surname1, double math1, double economy1, double eng1){
        id = id1;
        year = year1;
        name = name1;
        surname = surname1;
        math = math1;
        economy = economy1;
        eng = eng1;
    }
    Student (int id2, String name2, double math2, double economy2, double eng2){
        this(1,0, name2, null, math2, economy2, eng2);
    }
    Student (int id3, String surname3){
        this(id3,0,null,surname3,0.0,0.0,0.0);
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(1,2999, "Vasili","Vase4kin", 4.4, 5.0, 3.5);
        Student s2 = new Student(4,"Snoop",5.0,2,5);
        Student s3 = new Student(2,"Olegovi4");
        s3.eng = 4.4;
        s3.economy = 5.5;
        s3.year = 2022;
        s3.name = "Oleg";

        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);
    }
}
