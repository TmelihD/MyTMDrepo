package day16arraysforeachloop;

import java.util.Arrays;

public class Array03 {
    public static void main(String[] args) {

        //OR: Int bir Array olustur icine 6 eleman ekle.Bu elemanlarin en lucugu ile en buyugunun toplamini yazdir.

        int num[] = new int[6];

        num[0] = 20;
        num[1] = 80;
        num[2] = 40;
        num[3] = 33;
        num[4] = 55;
        num[5] = 76;

        System.out.println(Arrays.toString(num));

        //1.yol, sort metodu Arraydeki elemanlari kucukten buyuge dizer

        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        System.out.println(num[0]+num[num.length-1]);

        //2.yol ****

        int minimum = num[0] ;
        int maximum = num[4];


        for (int w : num) {
           minimum = Math.min(minimum,w) ;

        }
        System.out.println(minimum);



        for (int w : num) {
            maximum = Math.max(maximum, w);
        }
        System.out.println(maximum);



        System.out.println(minimum+maximum);



    }
}
