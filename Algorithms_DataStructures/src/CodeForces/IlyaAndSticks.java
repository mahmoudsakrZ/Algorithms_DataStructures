package CodeForces;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class IlyaAndSticks {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int stick=s.nextInt();
        Long []arr=new Long[stick];

        //fill the array

        for (int i=0;i<stick;i++){
            arr[i]=s.nextLong();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        BigInteger result = new BigInteger("0");
        int count=0;
        BigInteger buf = new BigInteger("1");
        for (int i=0;i<stick-1;i++){
            if(arr[i].equals(arr[i+1])){
                count++;
                buf=buf.multiply(BigInteger.valueOf(arr[i]));
                i++;


            }else if ((arr[i+1].equals(arr[i]-1))){
                count++;
                buf=buf.multiply(BigInteger.valueOf(arr[i+1]));
                i++;
            }
            if(count==2){
                result=result.add(buf);

                buf=BigInteger.valueOf(1);
                count=0;
            }
        }
        System.out.println(result);


    }
}