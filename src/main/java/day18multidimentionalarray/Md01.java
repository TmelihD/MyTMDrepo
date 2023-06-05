package day18multidimentionalarray;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {

//bir Array in elemanlari da Array ise bu bir multi dimensional Array dir .
        //OR:

        int a [][] =  new int[3][2];

        //MultiDimensionalm Arraylere eleman eklerken...

        a [0][0]=5;
        a [1][1]=45;
        a [2][0]=123;
        a [0][1]=12;
        a [1][0]=81;
        a [2][1]=0;

        System.out.println(Arrays.deepToString(a)); //Yazdirmak icin gereken method bu...


//Multi D Array icinden specific bir eleman nasil yazdirilir?

        System.out.println(a[1][1]);
        System.out.println(a[2][0]);

        //Multi D Array icindeki array nasil yazdirimir.

        System.out.println(Arrays.toString(a[0]));

        //Kisa yoldan MD Array olsuturmak .

        String students[][] = {{"Aly Jan","Caemal"},{"Asli","Zilli"},{"Tarik"},{"Ciri","Geralt","Yennefer"}};




        //OR: Yukaridaki Student Arrayinde toplam kac tane isim oldugunu bulunuz.

       int sum = 0;
        for ( Object[] w :  students ) {

           sum = sum + w.length;
        }
        System.out.println(sum);















    }
}
