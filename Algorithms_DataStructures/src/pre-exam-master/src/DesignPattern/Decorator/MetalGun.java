package DesignPattern.Decorator;

public class MetalGun extends GunDecorator {

    Gun decoreatedGun;

    MetalGun(Gun decoreatedGun) {
        super(decoreatedGun);
        this.decoreatedGun = decoreatedGun;
    }

    @Override
    public void attack() {
        decoreatedGun.attack();
        System.out.println("this is Metal Gun also");
    }
}
