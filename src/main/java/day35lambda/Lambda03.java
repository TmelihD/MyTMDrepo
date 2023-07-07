package day35lambda;

import java.util.stream.IntStream;

public class Lambda03 {
    public static void main(String[] args) {

        System.out.println(sumBetweenTwoInt(15, 10));


    }
    //12) Size verilen iki tamsayi arasindaki tum cift sayilarin
    // toplamini veren methodu yazin.
public static int sumBetweenTwoInt  (int a, int b){
   if (a>b){
      a=a+b;
      b=a-b;
      a=a-b;
   }

        return IntStream.
           range(a+1,b).
           filter(Utils::isNumberEven).
           sum();
}

















}
