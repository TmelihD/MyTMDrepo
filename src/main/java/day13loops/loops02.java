package day13loops;

public class loops02 {
    public static void main(String[] args) {

        //OR:21 den 180 e kadar hem iki hem 3 ile tam bolunen sayilarui ekrana yaediran code

       /* for (int i = 21; i<=180 ; i++){        -_-olmadi
            if (i%6 ==0){
                System.out.print(i+" ");
        */


        for (int i = 21; i<=180 ; i++){
            if (i%2 ==0 && i%3 == 0){
                System.out.print(i+" ");
            }
        }

        //OR:Size verilen kucuk harf ile yazilan stringin index i cift sayi olan characterlerini buyuk harf yap


        String s = "ankara";
        //i<=s.length()-1
        for(int i=0; i< s.length() ; i++  ){

            String ch = s.substring(i,i+1);

            if(i%2==0){
                System.out.println(ch.toUpperCase());
            }


        }

//OR:Verilen String de ilk a harfinden onceki tum karakterleri consola yazdir.

        String s1 = "I Love Java" ;

        for ( int i =0 ; i<s1.length();  i++){

            if (s1.charAt(i)=='a'){
                break;
            }
            System.out.println(s1.charAt(i));

        }


//OR:Verilen bir String de son 'a' dan sonraki tum karakterleri ters sirada yazdiriniz.

        String t = "Germany" ;

        for (int i = t.length()-1 ; i>=0  ; i--){

            if (t.charAt(i)=='a'){
                break;
            }
            System.out.println(t.charAt(i));
        }


























    }
}
