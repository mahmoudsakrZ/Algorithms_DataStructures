package DesignPattern.Decorator;

public abstract class GunDecorator implements Gun {

    Gun baseGun;

    GunDecorator(Gun decoreatedGun){
        this.baseGun = decoreatedGun;
    }


    public abstract void attack();

}
