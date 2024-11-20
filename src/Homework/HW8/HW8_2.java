package Homework.HW8;

public class HW8_2 {

    static final double pi = 3.14;

    public double ploshad (double r) {
        double s;
        s = pi*r*r;
        System.out.println("Для вычисления задан радиус: " + r);
        return s;
    }

    public static double dlina (double r1) {
        double dlinaKruga;
        dlinaKruga = 2*pi*r1;
        return dlinaKruga;
    }

    public void infoKrug (double r2) {
        System.out.println("Радиус круга равен: " + r2);
        System.out.println("Площадь круга = " + ploshad(r2));
        System.out.println("Длина круга = " + dlina(r2));
    }

}

class krugTest {
    public static void main(String[] args) {
        System.out.println(HW8_2.dlina(4));
        HW8_2 pervyi = new HW8_2();
        System.out.println("Площадь круга = " + pervyi.ploshad(7.6));
        pervyi.infoKrug(15);
    }
}
