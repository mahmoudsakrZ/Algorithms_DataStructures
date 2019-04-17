package JavaConcepts.immutableDate;

import java.util.Date;

public class test {
    public static void main(String[] args) {

       ImmutableClass j =  ImmutableClass.createNewInstance( 10 , "AHmed" , new Date());

        System.out.println(j);

        Integer x = j.getImmutableField1();
        x  = 500;
        System.out.println(j.getImmutableField1().hashCode());
        System.out.println(x.hashCode());

        Date date = new Date();
        System.out.println(date.hashCode());
        date = new Date(55);
        System.out.println(date.hashCode());

    }

}
