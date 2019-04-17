package JavaConcepts.Collections.List;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedArrayLisr {

    public static void main(String[] args) {


        LinkedList x  = new LinkedList();
        x.add(4);
        x.add(2);
        x.add(1);


        Collections.sort(x);

        System.out.println(x);


    }

}

