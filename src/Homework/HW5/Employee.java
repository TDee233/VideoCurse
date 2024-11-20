package Homework.HW5;

public class Employee {


    Employee(int id1, String surname1, int age1, double salary1, String department1) {
id = id1;
surname = surname1;
age = age1;
salary = salary1;
department = department1;
    }
    int id;
    String surname;
    int age;
    double salary;
    String department;

    double xx (){
        salary*=2;
        return salary;
    }
    void info(){
        System.out.println(id + salary + age);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "utka", 33, 300, "ofis");
        Employee e2 = new Employee(2, "utkarev", 36, 50.5, "zavod");
        System.out.println("Zarplata 1 rabotnika: " + e1.salary);
        e1.xx();
        System.out.println("Zarplata 1 rabotnika posle uvelichenia: " + e1.salary);

        e1.info();
    }


}


