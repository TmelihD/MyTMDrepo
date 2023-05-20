package day06swapvaluesstringmanipulations;

public class StringManipulation01 {
    public static void main(String[] args) {
        //String pir nP data type ve ayni zamanda bir class tir

        String s="Java is easy";

        //OR:"s" String deki tum karakterleri buyuk harf yap.

        String sUpper = s.toUpperCase();
        System.out.println(sUpper);

        //OR:s teki tum karakterleri kucuk harf yap.
       String sLower =  s.toLowerCase();
        System.out.println(sLower);

        //OR:s teki ilk characteri al.
        /* J         0.index
           A         1.index
           V         2.index
           A         3.index
                     4.index
           I         5.index
           S         6.index
           .
           .
         */
       char first= s.charAt(0);
        System.out.println("first = " + first);

        //OR:s String deki bastan 2 ve sondan 2.karakterleri al.

        char twolet = s.charAt(1);
        char twolet2 = s.charAt(10);
        System.out.println(""+ twolet+twolet2); //as ,Concatinatoin yaptigh


        //OR: s te kullanilan character sayisini bulunuz

        int saisi = s.length();
        System.out.println(saisi);

        //OR: s Stringdeki ilk 4 characteri aliniz.

        String ilk4 = s.substring(0,4);
        //substring ilk index dahil ikinci verilen index haric tir,a kadar dir.
        System.out.println(ilk4);

        // s tringdeki is i al.

       String is = s.substring(5,7);
        System.out.println(is);
//easy
        String easy = s.substring(8,12);
        System.out.println(easy);

        // 2.YOL:
        String son = s.substring(2);
        System.out.println(son);

        //OR: s te money kelimesini var olup olmadigini kontrol ed.
        boolean isMoney = s.contains("money");
        System.out.println(isMoney);
        boolean ise = s.contains("is e");
        System.out.println(ise);   //Bosluk moslluk her boku hesaplaman lazim Buyuk harf fln

        //s in belli bir harf ile baslayip baslamadigini kontrol ed.
       boolean isStart= s.startsWith("j");
        System.out.println(isStart);

        //OR: s i besinci index dahil 5.den itibaren i ile baslayip baslamadigini ctrl et.

        boolean is5 = s.startsWith("i",5);
        System.out.println("5.index "+ is5);


        //s in ikinci indexten ititbaren V ile baslayiop baslamafiogini kontrol et
         boolean is2 = s.startsWith("v",2);
        System.out.println(is2);
    }
}
