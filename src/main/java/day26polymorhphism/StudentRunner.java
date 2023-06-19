package day26polymorhphism;

public class StudentRunner {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.getStdId());//AC20230614
        System.out.println(s1.getNotOrt());//3.53
        System.out.println(s1.isSuccesful());//false

        s1.setNotOrt(4.99);
        System.out.println(s1.getNotOrt());

    }
}
