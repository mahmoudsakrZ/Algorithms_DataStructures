package DesignPattern.Builder.fesal;

public class Girl {

    private final String name;
    private final Hair hair;
    private final Dress dress;

    Girl( Builder builder ){
        this.name = builder.name;
        this.hair = builder.hair;
        this.dress = builder.dress;
    }


    static class Builder{
        String name;
        Hair hair;
        Dress dress;
        Builder(String name , Hair hair){
            this.name = name;
            this.hair = hair;
        }

        Builder withDree(Dress drees){
            this.dress = drees;
            return this;
        }

        Girl build(){
            return new Girl(this);
        }

    }

}
