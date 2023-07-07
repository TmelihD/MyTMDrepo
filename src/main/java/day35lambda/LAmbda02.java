package day35lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class LAmbda02 {




        public static void main(String[] args) {
            List<String> myList = new ArrayList<>();
            myList.add("Ali");
            myList.add("Elif");
            myList.add("Yusuf");
            myList.add("Elif");
            myList.add("Zeynep");
            myList.add("Mustafa");

           // removeIfLengthGreaterThanFive(myList);
            removeIfStartsWithZOrEndsWithf(myList);
            System.out.println(getSumSevenToSeventy());
            System.out.println(getFactorial(3));
        }

        //7) Character sayisi 5'ten fazla olan elemanları silen bir method oluşturun.

    public static void removeIfLengthGreaterThanFive (List<String>myList){
            myList.removeIf(t-> t.length()>5);
        System.out.println(myList);
    }

    //8  ) 'Z' ile başlayan yada 'f' ile biten elemanları silen bir method oluşturun.

    public static void removeIfStartsWithZOrEndsWithf(List<String>myList){
            myList.removeIf(t->t.startsWith("Z") || t.endsWith("f"));
        System.out.println(myList);
    }
    //9) 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz

    public static int getSumSevenToSeventy (){
        return     IntStream.
                rangeClosed(7,70).
                reduce(Math::addExact).
                getAsInt();
    }
    //11)Size verilen sayinin faktoryelini hesaplayan kodu yaziniz.

public static int getFactorial(int a) {
    if (a == 0) {
        return 1;
    } else if (a < 0) {
        System.out.println("Factorial islemi negatif sayilar ile yapilamaz");
        return -1;
    } else {
        return IntStream.
                rangeClosed(1, a).
                reduce(Math::multiplyExact).
                getAsInt();

    }


}























}
