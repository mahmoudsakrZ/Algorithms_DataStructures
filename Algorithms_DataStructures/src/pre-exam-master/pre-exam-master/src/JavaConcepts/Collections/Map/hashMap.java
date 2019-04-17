package JavaConcepts.Collections.Map;

import java.util.Collections;
import java.util.HashMap;


//   contains values based on the key.
//    contains only unique keys.
//    may have one null key and multiple null values.
//    is non synchronized.
//    maintains no order.
//    default capacity of Java HashMap class is 16 with a load factor of 0.75.

public class hashMap {

    public static void main(String[] args) {

        HashMap hashMap = new HashMap();
        hashMap.put(null , "vv");
        hashMap.put(null , "vv");
        hashMap.put(null , "vv");
        hashMap.put(null , "vv");


        hashMap.put("1","123");
        hashMap.put("5","123");
        hashMap.put("0","123");
        hashMap.put("4","123");


        System.out.println(hashMap);

    }
}
