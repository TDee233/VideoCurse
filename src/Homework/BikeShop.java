package Homework;

import java.sql.SQLOutput;

public class BikeShop {
    public static void main(String[] args) {


        Bike b1 = new Bike (1, 2000, 1000, "Yamaha", "650", "red");
        Bike b2 = new Bike (2, 2010, 1500, "Ducati", "1100", "black");

        b1.sale(200);
        System.out.println("Новая цена: " + b1.price + "$");

        b2.Info();
    }
}

class Bike {
    int id, year, price, km;
    String brand, engine, color;

    Bike(int id1, int year1, int price1, String brand1, String engine1, String color1) {
        id = id1;
        year = year1;
        price = price1;
        brand = brand1;
        engine = engine1;
        color = color1;
    }

    int sale(int amount) {
        price -= amount;
        System.out.println("Цена мотоцикла " + id + "-" + brand + " снижена на: " + amount + "$");
        return price;
    }
    void Info(){
        System.out.println(" Номер клиента: " + id + " год выпуска: " + year + " цена: " + price + " название брэнда: " + brand + " двигатель: " + engine + " цвет: " + color);
    }
}
    class Driver {
        String name, surname;

        Driver(String dname, String dsurname) {
            name = dname;
            surname = dsurname;
        }
    }
