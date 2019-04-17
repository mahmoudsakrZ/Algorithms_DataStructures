package JavaConcepts.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class main {

    public static void main(String[] args) {


        // sorting in java


        Collections.sort(new ArrayList<String>());


        ////////
        int x[] = new int[]{1, 2, 3};
        Arrays.sort(x);

// Searching in java

        // don't forget binary search must be sorted
        ArrayList<Integer> m = new ArrayList<>();
        m.add(0);
        m.add(1);
        m.add(1);

        int re = Collections.binarySearch(m, 0);
        System.out.println(re);


        /*
        *
        Arrays.binarysearch() vs JavaConcepts.Collections.binarySearch()
            Arrays.binarysearch() works for arrays which can be of primitive data type also.
            JavaConcepts.Collections.binarysearch() works for objects JavaConcepts.Collections like ArrayList and LinkedList.
        * */


        int[] k =  {1,3,5,0};
        Arrays.sort(k);

        System.out.println(k);
        for (int i = 0; i < k.length ; i++) {
            System.out.println(k[i]);
        }

    }

}


