package day13loops;

public class Loops03 {
    public static void main(String[] args) {

        //OR:Verilen bir String de kucuk harfleri consola yazmayiniz.

        //"Pwd12?Ab"

        String s = "Pwd12?Ab" ;

        for (int i =0 ; i<s.length() ; i++){

            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                continue;
            }else{
                System.out.println(ch);
            }
        }


        //break loop u kirmak ve durmak icin kullanilir
        //continue siradaki isleme skip gecmek icin kullanilir























































    }
}
