package Homework.HW14;

public class ForTime {

    static void time (){
        OUTER:
        for (int chas = 0; chas < 6; chas++) {

            MIDDLE:
            for (int minuta = 0; minuta < 60; minuta++){
                if (chas > 1 && minuta % 10 == 0) {
                    break OUTER;
                }
                INNER:
                for (int second = 0; second < 60; second++) {
                    if (second * chas > minuta) {
                        continue MIDDLE;
                    }
                    System.out.println(chas + ":" + minuta + ":" + second);
                }
            }
        }
    }

    public static void main(String[] args) {
//        ForTime hw14 = new ForTime();
//        hw14.time();
        time();
    }
}
