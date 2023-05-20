package day04scannerwrapper;

public class WrapperClass {
    public static void main(String[] args) {
            /*:  primitives...  Wrapper classlar prim leri non yapmak icin,method barindirmasi icin

    char     Character
    boolean  Boolean
    byte     Byte
    short     Short
    int       Integer
    long       Long
    float      Float
    double     Double

  */

        int n = 6;
        Integer m = 5;
        // n.
        //m.     dene...

   //short data typenin min ve max degerini code ile bul.
        short max= Short.MAX_VALUE;
                short min= Short.MIN_VALUE;
        System.out.println("max = " + max);
        System.out.println("min = " + min);


        //Or:Int data type nin min ,byte in max degerlerinin toplami

        int intmin = Integer.MIN_VALUE;
        byte bytemax=Byte.MAX_VALUE;
        System.out.println(intmin+bytemax);




        //OR:Primitive int i wrap int e cevir

        int a = 12;
        Integer b= a;
        // bu isleme Autoboxing deniyor

        //OR:Wrapper Byte i prim byte cevir

        Byte wrapperByte = 127;
        byte byteByte= wrapperByte;
        //bnuna da Unboxing denir

        //OR:Prim bir char i Wrapper Character yap

        char z= 'B';
        Character zWrapper = z;

        //OR:Wrapper Booleani prim boolean yap

        Boolean isHungryW = true ;
        boolean isHungry= isHungryW;





    }





}
