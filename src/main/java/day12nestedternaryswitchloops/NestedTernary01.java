package day12nestedternaryswitchloops;

public class NestedTernary01 {
    public static void main(String[] args) {


        //OR:verilen yilin artik yil olup olmadigini hesaplayan kod

        //Artik yil; 100 e bolunuyor ise ayni zamanda 400 e de bolunmelidir.eger
        //100 e bolunmuyor ise 4 e bolunmelidir,,,yoksa leap year yani artik yil degildir.


        int year = 1600;

       String leapYear = year%100==0 ?  (year%400==0 ?   "leap"   :   "not leap")  :  (year%4==0?  "Leap"  :  "Not leap");

        System.out.println(leapYear);



    }
}
