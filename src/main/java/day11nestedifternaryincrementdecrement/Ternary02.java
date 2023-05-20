package day11nestedifternaryincrementdecrement;

public class Ternary02 {
    public static void main(String[] args) {


        //OR:
        int a = 10;
        int b = 20;


        int r1 = a<b ? a++ : ++b ;
        System.out.println(a);//11
        System.out.println(b);//20
        System.out.println(r1);//10

        int r2 = a>b ? a++ : ++b ;
        System.out.println(b);//21
        System.out.println(r2);//21

        //OR: Verilen sayinin mutlak degerini hesaplayan kod.

        int c = -8;
        int r3 = c<0 ? -1*c : c;
        System.out.println(r3);


        //OR:Iki sayini isareti ayni ise carpan farkli ise farkli isaretli sayilar diyen kod

        int m =5;
        int n = -6;

        Object r4 = (m>0 && n>0)||(m<0 && n<0) ? m*n : "Farkli isaretli sayilar";
        System.out.println(r4);



        //OR:Verilen sayinin 3 basamakli olup olmadigini ctrl eden kod.

        int o = -555;
        o = Math.abs(o);

        String r5 = o>99 && o<1000 ? "Uc basamakli": "Uc basamakli degil";
        System.out.println(r5);





    }
}
