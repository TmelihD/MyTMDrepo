package day05concatinationoperatorstypecasting;

public class Operators {
    /* Dort islemleri Java da matematikteki gibi kullanir.Bolme farkli
    Not1: int/int => int olur
    2: double+int => double 11.0

    3. Java da "Logical Operators" vardir.And ve OR islemleri Logical
    Operatorlerdir
    AND && Isleminde true alabilmek ici  hersey true olmalidir
    AND ISlemi mukemmeliyetcidir "PErfectionist"

    OR || isleminde bir tane true sonucu yapmaya yeter
    OR ismeminde sonucun false olmasi icin her sey False olmalidir
    OR islemi "Polyanna" gibidir.

    NOT ! : !true=false
            !false=true
            !!true=true fdsdfqsqd

    Comparison operators..
    <, >, >=, >=, ==, !=
    Not:Karsilastirma operatorlerini Kullandiginizda kesinlikle
    boolean alirsiniz.


     */

    public static void main(String[] args) {

        boolean first = 3<5;
        System.out.println(first);
        boolean second = 2+3 != 5;
        System.out.println(second);
        System.out.println(first +"-"+ second );

        System.out.println(first&&second);
        System.out.println(first||second);

    }
}
