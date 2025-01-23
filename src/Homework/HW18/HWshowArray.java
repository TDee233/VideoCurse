package Homework.HW18;
import java.util.Arrays;

public class HWshowArray {

    public static void showArray (String [][] array100){
        System.out.println(Arrays.deepToString(array100));
        String s = Arrays.toString(array100);
        System.out.println(s);
    }

    public static void showArny(String[][] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++){
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                if (j != array[i].length - 1) {
                    System.out.print(array[i][j] + ", ");
                } else {
                    System.out.print(array[i][j]);
                }
            }
            if (i != array.length -1) {
                System.out.print("}, ");
            } else {
                System.out.print("}");
            }
        }
        System.out.println(" }");
    }

    public static void main(String[] args) {
        String [][] ary = {{"odin", "dva"}, {"tri"}, {"4etire", "pyat"}};
        String [][] array2 = {{"apple", "orange"}, {"hello", "bye", "ok"}, {"car"}};
showArray(ary);
showArny(ary);
showArny(array2);

showArray(array2);
    }
}
