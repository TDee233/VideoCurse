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

    public static int [] sortik(int [] array){
        int a;
        for (int i =0; i < array.length; i++){
            int min = array[i];
            int index = i;

            for (int j = i + 1; j < array.length; j++){
                if (array[j] < min){
                    min = array[j];
                    index = j;
                    }
            }

            if (i != index) {
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }
        System.out.println();
        return array;
    }

    public static void main(String[] args) {
        int [] array1 = {55, 81, 574, 214, -3, 0, 63};
        sortirovka(array1);

        int [] array2 = {5,8,1,-3,0,8,2,2};
        sortik(array2);
        for (int i = 0; i < array2.length; i++ ){
            System.out.println(array2[i]);
        }

    }

}
