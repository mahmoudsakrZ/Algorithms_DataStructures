package DesignPattern.Decorator;

public class NormalGun implements Gun {
    @Override
    public void attack() {
        System.out.println("Normal Gun will shoot ");
    }
}
