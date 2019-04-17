package DesignPattern.Builder.fesal;

public class App {
    public static void main(String[] args) {

        Girl.Builder b = new Girl.Builder("name" , new Hair());
        Girl girl =  new Girl(b);


    }
}
