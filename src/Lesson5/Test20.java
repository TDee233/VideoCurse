package Lesson5;

public class Test20 {

    int summa (int a, int b, int c){
        int result = a + b + c;
        return result;
    }

    int sredArifm(int a1, int b1, int c1){
        int result2 = summa(a1,b1,c1)/3;
        return result2;

    }
}

class Test21 {
    public static void main(String[] args) {
        Test20 metod = new Test20();
        int SUM = metod.summa(1,2,3);
        System.out.println(SUM);

        System.out.println(metod.sredArifm(24,66,45));

    }
}