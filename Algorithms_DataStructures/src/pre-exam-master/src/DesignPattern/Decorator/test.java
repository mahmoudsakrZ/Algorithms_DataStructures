package DesignPattern.Decorator;

public class test {
    public static void main(String[] args) {

        Gun scopedGun = new MetalGun(new ScopedGun(new NormalGun()));
        scopedGun.attack();

    }

}
