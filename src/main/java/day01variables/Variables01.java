package day01variables;// icinde bulunulan package ismi

public class Variables01 {

    public static void main(String[] args) {
        //java bu satiri okumaz,Kendimize ve ya baskalarina aciklamadir.
        /*
        java bu satirlari da okumaz
         */

        //Variable nasil olusturulur?

        /*
        Data Type + Variable name + Atama Operator (Assignement Operataru)+
        Variable degeri+ noktali virgul
        */
        int   age   = 13 ;
        /*
        java cumlesi => statement
        dil bilgisindeki nokta ne ise javadaki ' ; ' ayni seydir, yani
        statement in bittigini gosterir
       int age yazarak Variable Decleration yaptik
       geri kalani yani Assignement kisminda ise assignment operator '='
       sagindaki degeri solundaki kavanoza " reserved area " atti .

       Eger variable decleration yapar , assingnment yapmazsak java def olarak
       sayilar icin 0 atar

       Javada "=" assignment operator ve java bu operatoru gordugu zaman sag
       tarafi calistirir

       Javada esittir icin "=="

       Data type + VariableName == Variable decleration

       Assignment operator + variable degeri == Assignment
         */
        /*
        Javada temelde iki tip data vardir;
        1. primitive data type:
           char,boolean,byte,short,int,long,float,double

        2. non-primitive data type
        sayisiz var ,or: String


         */
        /*
        ornek 1: Ogrenci isimi icin variable olusturup deger olarak Ali Can atayiniz


         */ String orgenciAdi = "Ali Can" ;

         // Stringlere verilen degerler daima " icinde olmalidir
        // Stringler icin def value "null"

        /*
        String variable oluturdugumuzda cogu zaman ona bir deger atariz
        atama yapmazsak java o variable iscin varsayilan deger olan null koyar

        * null demek sifir demek degildir,0 coding te bir degerdir , null ise
        hiclik demektir,null demek icinde variable ve ya method bulunmayan bos bir
        kume / objedir


         */

        /* char data type :
        tek karakterler icin kullanilir.Sayi,sembol ya da harf farketmez
        OR: A , x , 4 , ? ,
        OR: char data type inda bir ismin ilk harfi olarak bir variable
        olusturunuz ve bir deger atayiniz...
        */
        char isminIlkHarfi = 'A' ;
        //char data type inda degerler her zaman ' icinde konur

        /*
        boolean data type:
        boolean lar sadece iki farkli deger alabilir. true  ve ya false

        isimlendirme yapilirken basina is konur
       */ // boolean data type inda emekli misin sorusu icin bir variable olusturun
        // ve false degerinin atayin .
        boolean isEmeklimisin = false ;
        /*
        byte data type:
        tam sayilar icindir.Hafizada bir byte yer kaplar
        byte -128 den +127 dahil atmsayi degerleri icin kullanilir
         */ //OR: byte data type inda ogrenci yasi icin bir variable olusturun deger ata
       byte studentAge = 15 ;
       /*
       short data type:
       tam sayilar icindir ama hafizada 2 byte yer kapliyor
       -32768 den 32767 araliginda yazabilirsin
       OR: site nufusu icin bir variable olustur ve deger ata
        */ short siteNufusu = 1300;

        /* int data type:
        tam sayilar icindir ve 4 byte yer kaplar
        -2 147 483 648 ile 2 147 483 647 arasinda
        OR: ulke nufusulari icin bir variable olustur ve deger ata
         */ int ulkeNufusu = 3000000 ;

         /* long data type:
         long tam sayilar icindir
         8 byte yer kaplar -9 223 378 036 854 775 808 den qsdfsqdfqsdf

          OR:insan vucudundaki hucre qsdfqsdf*/
        long insanVucudundakiHucreSayisi = 858658585865858581L;
          // not eger bir deger long ise sonuna"l" ya da "L" konur
        // Eger long a atanilan deger int in araliginda ise sonuna L komaya gerek yok
        // java bunu int olarak kabul eder ve 4 byte alir

       /* float data type:
       virgullu sayilar yani ondalikli yani decimal numbers icin kullanilir
       OR: GOmlek ve ayakkabi fiyatlari icin iki tane variable olusturun ve deger ata

        */ float gomlekFisyati = 12.99F;
        float ayakkabiFiyati = 20.99f;
        // java ondalikli sayilari otomatik olarak double kabul eder
        // FLoat icin sonuna F ya da f koy// 4 byte yer kaplar

        /* double data type:
        memoryde 8 byte yer kaplar
        ondalikli kisim icin daha fazla sayi alir
        ondalikli sayilar icin kullanilir

       OR:Hucrenin agirligi ve amip icin bir variable olustur
         */
        double weightCell = 0.000000000000000000112;
                double weightAmip = 0.000000000000000000000015;
                /* Ogrenci notlari ivin iki adet variable yaz ve toplamini ekrana yazdir

                 *///ekrana yazdirmak icin
        System.out.println(5);
        System.out.println(15);// ekrana yazdirir ve imleci ayni sirada tutar
        //soruya donelim

        byte note1=55;
        byte note2=32;
        System.out.println(note1+note2);
        //homework
        //3 farkli data turunde variable olsutur ve farkli satirlarda yazdir
        //Ulke ve sehir isimleri icin iki variable olustur ve yazdir
        // iki tam sayi turunde var olustur ve toplamini yazdir





    }

}
