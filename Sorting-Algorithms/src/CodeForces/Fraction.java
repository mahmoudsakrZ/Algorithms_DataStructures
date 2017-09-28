package CodeForces;

import java.math.BigInteger;
import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=(int)Math.ceil(n/2.0) -1;
        int b=0;

        for(int i=a;i>=1;i--){
            b=n-i;
            int gcd=getGCD(b,i);
            if(gcd==1){
                System.out.println(i);
                System.out.println(b);
                break;
            }

        }



    }

    // unused method
    public static int getGCD(int x, int y) {
        BigInteger a = BigInteger.valueOf(x);
        BigInteger b = BigInteger.valueOf(y);
        return (a.gcd(b).intValue());
    }
}
