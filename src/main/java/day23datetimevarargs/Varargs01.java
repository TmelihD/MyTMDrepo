package day23datetimevarargs;

public class Varargs01 {
    public static void main(String[] args) {

        toplama(2,6,6);

        add(1,4,5,6,7);

    }
    public static int add(int...a){

        int sum = 0;
        for (int w: a) {
           sum = sum+w;
        }
        return sum;
    }






    //Asagidaki gibi her seferinde elle ekleyerek adam gibi is yapamayiz, nereye kadar bilader.Iste buyuzden Supurge saticisi Java farkli sayidaki parametrelerin hepsini kabul eden bir
    //yapi olusturdu.
    //Varargs arkada array yapisini kullanir.

    //Toplama islemi yapan method

    public static int toplama(int a,int b){
        return a+b ;
    }
    public static int toplama(int a,int b, int c){
        return a+b+c ;
    }

    public static int toplama(int a,int b, int c, int d){
        return a+b+c+d ;
    }







}
