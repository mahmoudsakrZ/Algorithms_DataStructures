package JavaConcepts.Collections.List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);


       int x=  Collections.binarySearch(arrayList , 50);

        System.out.println( "index : " + x);

    }
}
