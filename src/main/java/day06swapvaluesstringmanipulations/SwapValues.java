package day06swapvaluesstringmanipulations;

public class SwapValues {
    public static void main(String[] args) {
        //Swap yapiyos

        int a =12;
        int b =5;
        // Swap den sonra a = 5   b =12 olsun

        int temp = 0;
        //1
        temp = a;
        //2
        a=b;
        //3
        b=temp;

        //2.Yol

        int elma = 12;
        int armut = 5;

        elma= elma+armut;
        armut = elma-armut;
        elma = elma-armut;
        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);

    }
}
