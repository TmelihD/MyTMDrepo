package day05concatinationoperatorstypecasting;

public class AsciiValues {
    public static void main(String[] args) {
        /*
        Java da her karakterin sayisal bir degeri vardir.Bu degerler
        sayesinde compile islei yapiliyor.Buna Ascii degerler olarak
        Adlandirliir.Bu degerlerin bulundugfu tabloya Ascii table denir.

         */

        char a = 'a';
        System.out.println(a);//a
        int inta = 'a';
        System.out.println(inta);
        /*Herhangi bir karakterin ascii degerini bulmak icin
        okarakteri int type da chara yaz,byte la falan
         da calisir btw */

        int unlem = '!';
        System.out.println(unlem);

        char c1 = 'K';
        char c2 = '?';
        System.out.println(c1+c2);
        // Javada char typelar matematikte kullanirsan Ascii degerlere gore islem yapar



    }
}
