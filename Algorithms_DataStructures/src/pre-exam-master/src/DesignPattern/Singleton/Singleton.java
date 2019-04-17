package DesignPattern.Singleton;

public class Singleton {

    private static final Singleton INSTANCE = new Singleton();


    public static Singleton getInstance(){
        return INSTANCE;
    }

}
