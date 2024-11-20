package Homework;

public class HW7 {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Газманов", 2500);
e1.nomer();
e1.zarplata();

Employee e2 = new Employee(2, "Иванов");
//Employee e3 = new Employee(3, 8800.5);


    }
}

class Employee {
    protected int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public void nomer (){

        System.out.println("Номер работника: " + id);
    }

    public void zarplata () {
        System.out.println("Зарплата работника: " + salary);
    }

    public void family () {
        System.out.println("Фамилия работника: " + surname);
    }

    public Employee(int id1, String surname1, double salary1){
        id = id1;
        surname = surname1;
        salary = salary1;
        System.out.println("Данные внесены");
    }

    Employee(int id2, String surname2){
        id = id2;
        surname = surname2;

        System.out.println("Данные внесены");
    }

    private Employee(int id3, double salary3){
        id = id3;
        salary = salary3;
        System.out.println("Данные внесены");
    }

    static Employee e5 = new Employee(4, 500.5);
}
