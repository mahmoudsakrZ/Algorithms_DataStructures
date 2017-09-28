package CodeForces;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PolycarpandLetters {
    static {
        System.out.println("Hello World !!");
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(); // 1- 200
        String st=s.next();
        char arr[]=st.toCharArray();
        int max=0;
        Set set=new TreeSet();
       for (int i=0;i<n;i++){

           if(Character.isUpperCase(arr[i])){
               if(max<set.size()){
                   max=set.size();


               }
               set=new TreeSet();
           }else {
               set.add(arr[i]);
               if (i==(n-1)){
                   if(max<set.size()){
                       max=set.size();
                   }
               }
           }

       }
        System.out.println(max);

    }
}
