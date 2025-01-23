package Homework.HW18;
import java.util.Arrays;

public class HWsortirovka {

    public static void sortirovka (int arra[]){
//        for (int i = 0; i < arra.length; i++) {


            Arrays.sort(arra);

            for (int i = 0; i < arra.length; i++) {
                System.out.print(arra[i] + " ");
            }
            System.out.println();
//        }


    }

    public static void main(String[] args) {
        int [] array1 = {55, 81, 574, 214, -3, 0, 63};
        sortirovka(array1);
    }

}
