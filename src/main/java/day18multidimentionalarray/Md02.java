package day18multidimentionalarray;

public class Md02 {
    public static void main(String[] args) {


        String students[][] = {{"Aly Jan","Caemal"},{"Asli","Zilli"},{"Tarik"},{"Ciri","Geralt","Yennefer"}};

        //OR:Yukaridaki Students Arryaindeki icinde "m" harfi olan isimleri console a yazdir .


        for ( String[] W: students ) {

            for ( String k: W ) {

            if (k.contains("m")){
                System.out.println(k);
            }
            }

        }


        //OR: int md array olsutur icindeki elemanlarin carpimini yazdir.

        int nums[][] = {{5,4},{2,3,2},{7}};
int p = 1;

        for ( int[] w: nums ){
            for (int k: w) {

                p = k*p ;
            }
        }

        System.out.println(p);





    }
}
