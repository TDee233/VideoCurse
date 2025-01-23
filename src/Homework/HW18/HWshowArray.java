package Homework.HW18;
import java.util.Arrays;

public class HWshowArray {

    public static void showArray (String [][] array100){
        System.out.println(Arrays.deepToString(array100));
    }

    public static void main(String[] args) {
        String [][] ary = {{"odin", "dva"}, {"tri"}, {"4etire", "pyat"}};
showArray(ary);
    }
}
