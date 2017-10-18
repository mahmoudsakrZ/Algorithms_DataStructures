package dataStructures;

import java.util.*;


public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList l=new LinkedList<String>();
        l.addFirst("10");
        Hashtable<String, Integer> s=new Hashtable();
        s.put("Mahmoud", 10);
        s.put("Ahmed", 2);
        s.put("Ali", 11);
        s.put("yousef", 12);
        System.out.println(s.get("Ahmed"));
        System.out.println(s.hashCode());
        List<String> list=new ArrayList();
        list.add("Mahmoud");
        list.add("Ali");
        list.add("Ali");
        list.add("Ahmed");
        for (String a :list){
            System.out.println(a);
        }

    }
}
