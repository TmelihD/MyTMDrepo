package day08stringmanipulationmemoryusageifstatement;

public class IfStatements {
    public static void main(String[] args) {

//OR:eger sayi powitif ise ekrana pozitif yazdir.

        int num = 13;
        if(num>0){
            System.out.println("Pozitif");
        }
        if (num<0){
            System.out.println("Negatif");
        }

        //OR:Sayi -1 ve 10 arasinda ise ekrana rakam yazdir.
        int n = 5;
        if(n>-1 && n<10){
            System.out.println("Rakam");
        }
    }
}
