package Lesson13;

public class Test1 {
    
}

class Student {
    int grade;
    Student (int grade){
        this.grade = grade;
    }

    public static void main(String[] args) {
        
        Student st1 = new Student(2);

        switch (st1.grade) {
            case 2:
                System.out.println("dvoechnik");
               break;
            case 3:
                System.out.println("troechnik");
                break;
            case 4:
                    System.out.println("horosho");
                    break;
            case 5:
                System.out.println("otli4nik");
                break;
            default:
                System.out.println("ocenka nevernaya");

        }

//        if (st1.grade == 2){
//            System.out.println("Студент двоечник");
//        } else if (st1.grade == 3) {
//            System.out.println("Студент троечник");
//        } else if (st1.grade == 4) {
//            System.out.println("Студент хорошист");
//        } else if (st1.grade == 5) {
//            System.out.println("Студент отличник");
//        }
//        else
//            System.out.println("Оценка неверна");
    }
}