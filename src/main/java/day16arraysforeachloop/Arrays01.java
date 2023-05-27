package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {


        int a = 13;
        // Bu yapini icinde sadece birtane data depolanabilir.
        //Ama biz kod yazarken bir yapinin icinde coklu data depolama ihtiyaci hissederiz,
        //Bir yapinin icinde coklu data depolayamabilmek icin Java Array leri olusturlustur.


        //Arrya nasil olusturulur?

        String studentNames [] = new String[5];
        System.out.println(Arrays.toString(studentNames));

        /*
        Array ler diger collection lardan cok cok daha hizlidir(superfast).
        Arrayler diger collection lardan daha az memory kullanirlar. to String metodunu kullanmadan sadece
        Array ismi ile yazdirirsaniz , Array adresini console a yazdirir.
         */
        //
        //Arraylerde depolar index mantigi ile calisir, 5 depo 0,1,2,3,4 indextir

        //Array e eleman eklemek...

        studentNames[1]="Benna";
        studentNames[2]="Abdullah";
        studentNames[3]="Ekim";
        studentNames[0]="Melih";
        studentNames[4]="Recep";

        System.out.println(Arrays.toString(studentNames));

        //Array den specific bir elemani nasil aliriz?

        System.out.println(studentNames[3]);
        System.out.println(studentNames[0]);

        //OR: Array deki her elemanin sonuna ! isareti koyarak ekrana yazdiriniz.
        //length() Stringlerde method (parantezli) ,Arraylerde ise parantezsiz yazilir (method degil)

        for (int i = 0 ; i<5 ; i++){
            System.out.println( studentNames[i]+"!");
        }






    }
}
