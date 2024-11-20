package Lesson8;

public class Student {
    String name;
    int course;
    static int count;
    int a;

    public Student(String name2, int course2){
        count++;
        name = name2;
        course = course2;
        System.out.println("Студент № " + count + " создан");
    }

    public static void showCount(){
        System.out.println("Всего создано студентов: " + count);
    }

    public void showInfo(){
        System.out.println("Welcome to the Student class!");
    }

    void abc(){
        a++;
        count++;
    }

    static void abcd(){
        count++;

    }

    public static void main(String[] args) {
Student st1 = new Student("Ivan", 1);
Student st2 = new Student("Petr", 4);
Student st3 = new Student("Masha", 2);

        System.out.println("Количество созданных студентов: " + Student.count);
        showCount();
        st2.showCount();
    }
}