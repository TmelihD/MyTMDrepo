package day12nestedternaryswitchloops;

public class Switch01 {
    public static void main(String[] args) {

        //OR:Gun sisimlerini verince kacinci gun oldugunu yazan bir kod yaz.

        //1.yol
        String days = "friday";

        if (days.equalsIgnoreCase("sunday")){
            System.out.println("1");
        }else if (days.equalsIgnoreCase("Monday")){
            System.out.println("2");
        }else if (days.equalsIgnoreCase("Tuesday")){
        System.out.println("3");
    }else if (days.equalsIgnoreCase("Wednesday")){
            System.out.println("4");
        }else if (days.equalsIgnoreCase("Thursday")){
            System.out.println("5");
        }else if (days.equalsIgnoreCase("Friday")){
            System.out.println("6");
        }else if (days.equalsIgnoreCase("Saturday")) {
            System.out.println("7");
        }else{
            System.out.println("Lutfen gecerli bir gun ismi giriniz...");
        }

        //2.yol switch

        switch (days.toLowerCase()){
            case "sunday":
                System.out.println("1");
                break;
            case "monday"   :
                System.out.println("2");
                break;
            case "tuesday"   :
                System.out.println("3");
                break;
            case "wednesday"   :
                System.out.println("4");
                break;
            case "thursday"   :
                System.out.println("5");
                break;
            case "friday"   :
                System.out.println("6");
                break;

            case "saturday"   :
                System.out.println("7");
                break;
            default:
                System.out.println("Gecerli bir gun ismi gir");


        }



    }
}
