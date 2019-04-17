package JavaConcepts.nestedClass.InnerClasses.annoynomusClass;

public class TestAnonymousInner{

    public static void main(String args[]){

        Person p = new Person(){

            void eat(){System.out.println("nice fruits");}

        };

        p.eat();

    }

}


abstract class Person{
    abstract void eat();
}



