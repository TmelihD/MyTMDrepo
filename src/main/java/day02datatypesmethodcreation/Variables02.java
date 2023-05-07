package day02datatypesmethodcreation;

public class Variables02 {

    /* muhtemel interwiev sorulari

    Java'da temelde 2 tip data vardir
    primitive ve non-primitive data types

    primitives;
    char,boolean,byte,short,int,long,float,double

    Not:* Primitive data type lari jav tarafindan olusturulur biz olusturamayiz
    * Prmitive data type lari isimlerinde sadece kucuk harf kullanilir
    * Primitive data typler,type larina gore memory de farkli yer kaplarlar
    *primitive datalar iclerinde sadece sizin atadiginiz degeri barindirirlar

    Non-Primitive data types
    OR: String non primitive type dir
    *Uretilen her bir class ayni zamanda bir non-primitive data typedir
    buyuzden none primitive data typelar sinirsiz sayidadirlar denilebilir.
    * Non-primitive data type larin isimleri buyuk harf ile baslar
    * Non-primitive ler icin java memoryde buyuklugune gore degisen boyutlarda
    yer ayirir.

     */
    public static void main(String[] args) {
        //OR:* Ulke ismi icin bir variable olusturun ve yazdirin.
        String nameCountry = "France";
        System.out.println(nameCountry);
        /*
        SOru**:Primitive ve non primitive data typelari arasindaki farklar
        nelerdir.
        el-cevap: 1) Primitive ler sadece bizim atadigimliz degerleri icerir
        non-primitiveler bizim atadigimiz degeri ve method lari icerir.
        2) Primitiveler kucuk harf ile baslarken none-primitiveler buyuk
        harfler ile baslar.
        3)Primitiveler java tarafindan uretilir ve 8 tanedir,non-primitiveler
        java ve developerlar tarafindan uretilir ve sayisi belli degildir
        4)Primitiveler tipine gore sabit boyutta bellek kullanirlar
        non-primitive ler boyutuna gore degisebilirler


         */

    }

}
