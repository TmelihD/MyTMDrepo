package day02datatypesmethodcreation;

public class MethodCreation01 {

    /*
    Java da method olustururken
    1) main methodun disinda classin icinde olusturulur
    2) Access modifier + return type+ method ismi + () + {}

    Methodu olusturmak kullanmak icin yeterli degildir,kullanilmak istenen method
    main in icinden secilir
    methodun ismi + () yazin
    *methodun ismi + parametreler method signiture olarak alandirilir
     */
    public static void main(String[] args) {
      int sonuc=  toplamaYap(3,5);
        System.out.println(sonuc);

        long carpmaSonuc = multiply(4,5);
        System.out.println(carpmaSonuc);

        firstTwoMultipyThirdAdd(2,3,4);
        System.out.println(firstTwoMultipyThirdAdd(2,3,4));



    }
    //OR:toplama islemi yapan bir method olustur ve kullan
    public static int toplamaYap(int a,int b){
        return a+b ;
// main method static oldugu icin main menthod icin de kullanacagimiz
        //method static olmali
    }
    //OR:iki sayiyi carpma islemi yapan bir method olustur ve kullan
    protected static long multiply(int a,int b){
        return a*b;
    }
//OR: verilen 3 sayidan ilk ikisini carpan ve digerini ile sonucu toplayan
    //method yaz kullan
    private static int firstTwoMultipyThirdAdd(int a,int b,int c){
        return a*b+c;
    }
    /*
    odev:Dikdortgenin alanini hesaplayan bir method yaz kullan
    ve cevresini hesaplayan bir" " " " " "
    
     */


    public static int bisey(int a,int b){
        return a+b;
    }
}
