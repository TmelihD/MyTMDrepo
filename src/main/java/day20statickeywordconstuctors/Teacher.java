package day20statickeywordconstuctors;

public class Teacher {

    String name ;
    int age;
    String adresse;

    public Teacher(String name, int age, String adresse) {
        this.name = name;
        this.age = age;
        this.adresse = adresse;
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
