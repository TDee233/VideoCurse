package Lesson18;

public class Test2 {
    public static void main(String[] args) {

        int [] a, b; // a и b одномерные массивы
        int p, cc[]; // р - переменная инт, сс - массив
        int [] as, ee[][]; // as - одномерный массив, ee - трехмерный массив


        String [] array1;
        int [][] array2;

        array1 = new String[3];
        array2 = new int[3][];

        for (int i = 0; i < array1.length; i++){
            array1[i] = "privet" + i;
            System.out.println(array1[i]);
        }

        array2[0] = new int[5];
        array2[1] = new int[2];
        array2[2] = new int[7];

        for (int i = 0; i < array2.length; i++){
            for (int j = 0; j < array2[i].length; j++){
                array2[i][j] = i +j;
                System.out.println(array2[i][j]);
            }
        }
    }
}
