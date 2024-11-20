package Homework.HW12;
import Lesson11.Student;


public class StudentTest {

    public static void main(String[] args) {


        Student st3 = new Student("Саня", 3, 44);
        Student valera = new Student("Саня", 3, 4);

        //sravnenie(valera, st3);
        nestedSravnenie2(st3, valera);
    }

    public static void sravnenie (Student s1, Student s2) {
        if (s1.course == s2.course && s1.grade == s2.grade)
            System.out.println("Студенты равны");
        else
            System.out.println("Студенты отличаются");
    }

    public static void nestedSravnenie (Student s1, Student s2) {
        if (s1.grade != s2.grade) {
            System.out.println("Оценка отличаются");
        } else if (s1.course != s2.course) {
            System.out.println("Курсы отличаются");
        } else if (!s1.name.equals(s2.name)) {
            System.out.println("Имена отличаются");
        } else
            System.out.println("Студенты совпадают");
    }

    public static void nestedSravnenie2 (Student s1, Student s2) {
        if (s1.name.equals(s2.name)){
            if (s1.course == s2.course){
                if (s1.grade == s2.grade) {
            System.out.println("Все параметры совпадают");
        }
        else
            System.out.println("Имя и курс совпадают, оценки отличаются"); }
        else
                System.out.println("Имя совпадает но курс отличается");}
        else
            System.out.println("Имена отличаются");
    }



}
