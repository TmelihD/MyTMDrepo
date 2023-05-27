package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //OR; String Array olustur icine 5 eleman ekle ilk ve sopn elemanin icerdigi karakter toplamini ekrana yazdir.

        String arr[] = new String[5];
        arr[0]= "Math";
        arr[1]= "Geography";
        arr[2]= "Science";
        arr[3]= "Art";
        arr[4]= "Music";

        System.out.println(Arrays.toString(arr)); //[Math, Geography, Science, Art, Music]

        System.out.println(arr[0].length() + arr[arr.length - 1].length());





       //OR:String bir array olustur icine bes tane eleman ekle,Tum elemanlarin icerdigi karakter sayilari toplamini ekrana yazdirin.


       String arr2 [] = new String[5];

       arr2 [0] = "Miami";
       arr2 [1] = "Istanbul";
       arr2 [2] = "Amsterdam";
       arr2 [3] = "Oslo";
       arr2 [4] = "Bayburt";

       //1.yol

        int totalchar= 0;

        for (int i = 0; i< arr2.length ; i++){
           totalchar = totalchar + arr2[i].length();
        }
        System.out.println(totalchar);



        //2.yol for each loop

        //Baslangic degeri, loop un calisma sarti , ve inc dec kisminikendisi halleder.

        //for each loop Arrayler ve collection larda kullanilir.

       /* for (  DataType w: arr/collection  ){
            calisacak kodlar
        }
        */


        int sum = 0;
        for (String w: arr2 ) {
           sum = sum+w.length();
        }
        System.out.println(sum);




        //OR: Notlar adinda Integer bir array olusturn icine 6 tane not yerlestir,ortalamayi yazdir


        int notlar []=new int[6];

        notlar[0]= 30;
        notlar[1]= 80;
        notlar[2]= 40;
        notlar[3]= 90;
        notlar[4]= 30;
        notlar[5]= 84; //!

        System.out.println(Arrays.toString(notlar));

        int toplam = 0;

        for (int w:notlar ) {
          toplam = toplam + w ;
        }
        System.out.println(toplam/notlar.length);








    }
}
