package day28interfacecollections;

public interface Engine {

    void run();
int price = 3000;

default void eco(){ // Def ve static keywordu cocrete metyho dolusturmaya ayarar.
    System.out.println("Uses gas less");
}
}
