package JavaConcepts.AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomic {
    public static void main(String[] args) {


        AtomicInteger x = new AtomicInteger(5);
        x.incrementAndGet();
        System.out.println(x);
        x.addAndGet(20);
        System.out.println(x);
    }
}
