package day24stringbuilder;

public class Sb3 {
    public static void main(String[] args) {


        /*
        String buffer java da string ureten ilk classtir.

        String builder a cok benzer,yani ikiside "mutable" string uretir.

        String buffer multi thread dir ama String builderlar degildir.

        String builder multi thread olmadigi icin string bufferdan daha hizli calisir.
           multi thread yaparken yapilan islerin siralamasi onemlidir.
           synchronization onemlidir.
           multi thread oldugu zaman synchronized tir.

        Hangi String ne zaman kullanilir ?

        eger immutable String lazimsa String class
        mutable lazimsa builder ve buffer class
      a) String Buffer multi thread gerekirse kullaniriz , String builder ise gerekmez ise kullaniriz .

         */

StringBuffer sbf = new StringBuffer("java");









    }
}
