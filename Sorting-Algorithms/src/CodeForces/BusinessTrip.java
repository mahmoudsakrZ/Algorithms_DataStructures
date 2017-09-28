package CodeForces;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BusinessTrip {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Integer arr[]=new Integer[12];
        int k=s.nextInt();
        for (int i=0;i<12;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        int sum =0;
        int count=0;
       for (int i=0;i<12;i++){
           if(sum<k){

               count++;
               sum+=arr[i];

           }

       }
       if(sum<k)
        System.out.println(-1);
        else System.out.println(count);
    }
}
