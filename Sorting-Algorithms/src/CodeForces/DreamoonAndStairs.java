package CodeForces;

import java.util.Scanner;

public class DreamoonAndStairs {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        System.out.println(getSteps(n,m));





    }
    public static int getSteps(int n, int m){
        int min=(int) Math.ceil(n/2.0);
        if(n<m){
            return -1;
        }else if(n==m){
            return n;
        }else {

            for (int i = min; i <= n; i++) {

                if(i%m==0){
                    return i;

                }

            }
            return -1;
        }

    }
}
