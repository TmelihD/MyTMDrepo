package day05concatinationoperatorstypecasting;

public class TypeCasting {
    public static void main(String[] args) {

        /* Numeric primitive data typelarin donusturulmesine
        Type Casting denir.
        byte short int long float double
         */
        /* Kucuk data typelarini buyuk data typelarina cevirmeyi
        Java otomatik olarak yapar.Buna AutoWidening denir.

        Buyuk Data typelarini kucuk data typelarina cevirmek riskli
        bir istir.Java bunu otomatik olarak yapmaz.Bu islemleri
        coder lar yapar.Buna ExplicitNarrowing ,aciktan daraltma
        denir.
         */

        //byte type int e cevir.
        byte age =13;
        int ageint = age;

        //int i short yap
        int weight =312;
        short weightShort = (short) weight;

        //int i float a cevir

        int a = 12;
        float b = (float)a;
 //double to short

        double z = 23.9;
        System.out.println(z);
        short y = (short)z ;
        System.out.println(y);

        // EX
        short num = 260 ;
        System.out.println(num); //260
        byte numByte = (byte)num;
        System.out.println(numByte);// 4

        // Bu esnada java mod islemi yapar ve islemin sonucu yeni deger
        //olur







    }
}
