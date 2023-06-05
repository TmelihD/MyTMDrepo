package day19passbyvaluesmethodoverloading;

public class PAssByValue02 {
    public static void main(String[] args) {

        String name = "Tom Hanks";


        System.out.println(addTitle("Dr",name));
        System.out.println(name);




    }
    public static String addTitle (String title,String name){
        name= title +" " +name;
        return name;
    }

    /*Pass by value methodlar orjinal variable in kopyasi ile kullanilir
    orjinal deger biz degistirmedigimiz surece sabit kalir.



    Pass bu refeerence da method a referans yollanir,referans adres demektir.Adress yollaninca method adresi kullanarak orjinal degeri degistirir.
    "C#" gibi pass by reference kullanan dillerde method variable in orjinal dilini degistir.
     */








}
