package day15loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        //While

       /* baslangic degeri
                while(looop calisma kurali){
                    calisacak kod
                            ++ --
        }
        */

        //Do while

        /* baslangic degeri

                do{  calisacak kodlar
                        ++/--

                }while (  callisma kurali );

         */

        //OR: 5 dahil den 3 dahil e kadarki tum sayilari console a yazdir...

        int a = 5;
        do {
            System.out.println(a);
            a--;

        }while (a>2);

        //1) While Loop

        int i =1;
        while (i<1){
            System.out.println("Sen bir while loopsun");
            i++;
        }
        //While loopta zero execution mumkundur(loop un hic calismamasi)




        //2)do while loop
        int k =1;
        do {
            System.out.println("Sen bir do while loopsun");
            k++;
        }while (k<1);


//do while loop ta zero execution mumkun degildir(en az birkere calisir )





    }
}
