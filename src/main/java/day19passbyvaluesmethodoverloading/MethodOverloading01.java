package day19passbyvaluesmethodoverloading;

public class MethodOverloading01 {
    public static void main(String[] args) {

        add(3.0,5);
      //  add(3.0,5,6);//Explicit narrowing,Java bunu otomatik yapamaz.



    }
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void add(double a,double b){
        System.out.println(a+b);
    }
    public static void add(double a,int b){
        System.out.println(a+b);
    }
    public static void add(int a,double b){
        System.out.println(a+b);
    }
    public static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
/*
Metod Overloading yaparken ...
1)ismi degistirilmez.
2)Parametreler degistirimir.
3)Parametreleri deegistirirken parametrelerin data type laraini degistirilebilir.
4)Parametreler degistirirken ; parametre sayisi degistirtilerbilir, parametrelerin yerleri degistirilebilir ama
yanlizca data type lari birbirinden farkli ise...
5)Java icin "ismi" ve "parametreleri" ayni olan iki method tamamen aynidir.Bu yuzden isim ve parametre metod signituree olarak adlandirilir.
6)Method overloading olustururken return type i degistirmenin hic bir etkisi yoktur.
7)Method overloading olustururken access modifier  degistirmenin hic bir etkisi yoktur.
8)Method overloading olustururken method un static ve ya non static yapmanin  hic bir etkisi yoktur.
9)Method overloading olustururken body i degistirmenin hic bir etkisi yoktur.

10)Private methodlar overloading yapilabilir.(Ayni class icerisinde oldugu surece).
11)Static method lar overload edilebilir.
12)Overloading yapabilmek icin method ismi degismeden method signiture degistiririz,dolayisi ile sign degistiginde yeni bir method olusturmus oluruz,bu neden le static olmasi bisey degistirmez.



 */
}
