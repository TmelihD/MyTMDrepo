package day09Ifstatements;

public class IfStatements01 {
    public static void main(String[] args) {


        //sayi iki basamakli ise iki basamakli yazdir

        int number = -123;
           number = Math.abs(number);

        if (number>99 && number<1000){
            System.out.println("3 basamakli bir sayi");
        }

//OR:Bir stringdeki tekrarsiz characterleri ekrana yazdir.

      //abbccdc=> ad

      String str1 = "aac"  ;

       char ch1= str1.charAt(0);

       if (str1.indexOf(ch1)==str1.lastIndexOf(ch1)){
           System.out.println(ch1);
       }
        char ch2= str1.charAt(1);

        if (str1.indexOf(ch2)==str1.lastIndexOf(ch2)){
            System.out.println(ch2);}

        char ch3= str1.charAt(2);

        if (str1.indexOf(ch3)==str1.lastIndexOf(ch3)){
            System.out.println(ch3);}



    }
}
