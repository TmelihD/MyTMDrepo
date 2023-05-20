package day11nestedifternaryincrementdecrement;

public class IncrementDecrement {
    public static void main(String[] args) {

        //Increment
       //Onceden...
        int a =5;  //5
        a= a+2 ; //7
        System.out.println(a);

        a+=2;//9
        System.out.println(a);

        //OR: Int olsutur ve onu iki sekilde de 5 arttir

        int b = 6;
                b=b+5;
                        b+=5;
        System.out.println(b);

        //Decrement

        int c= 8;
        c=c-3;

        // Dec
        c-=3;
        System.out.println(c);




        ///////////////////////////////////////////////
        //OR:
        int d =6;
        d*=3;
        System.out.println(d);

        //OR
        int e = 24;
        e/= 2;
        System.out.println(
                e
        );

        // 1 ile increment...

        int f = 12;

        f++;

        //OR:
        int h = 10;

        h--;


        ///////////////////////////////////////////////////////////////////////////

        //post-increment ve pre-increment

        int i = 10;
        int k = i++;            //post-inc
        System.out.println(i);// i satir sonunda arttirildigi icin degeri 11
        System.out.println(k);// i arttirilmadan k ya kondugu icin degeri 10


        int m = 15;
        int n = ++m;             //pre-inc

        System.out.println(m);//m satir sonunda arttirildigi icin 16
        System.out.println(n);//n arttirildiktan sonra sepete kondugu icin degeri 16



    }
}
