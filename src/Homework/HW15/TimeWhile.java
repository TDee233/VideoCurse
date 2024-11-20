package Homework.HW15;

public class TimeWhile {
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

    static void whileTime (){

        int chas1 = 0;
        OUTER:
        while (chas1 < 6) {
            int minuta1 = -1;
            MIDDLE:
            do {
                minuta1++;
                int secunda = 0;
                INNER:
                while (secunda < 60) {
                    System.out.println(chas1 + ":" + minuta1 + ":" + secunda);
                    secunda++;
                }
            }

            while (minuta1<59);
                chas1++;
        }

    }

    public static void main(String[] args) {

        whileTime();
    }
}

