package DesignPattern.Decorator;

public class ScopedGun extends GunDecorator {

    Gun decoratedGun;

    ScopedGun(Gun decoreatedGun) {
        super(decoreatedGun);
        this.decoratedGun = decoreatedGun;
    }

    @Override
    public void attack() {
        decoratedGun.attack();
        System.out.println("shoot Gun with scope");
    }
}
