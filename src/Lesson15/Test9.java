package Lesson15;

public class Test9 {
    public static void main(String[] args) {
    int chas = -1;
       OUTER:
       do {
           chas++;
            int minta = 0;

            INNER:
            while (minta <60) {
                if (minta == 20) {
                    continue OUTER;
                }
                System.out.println(chas + ":" + minta);
                minta++;

            }
//            chas++;

        }
       while (chas <24);
    }
}
