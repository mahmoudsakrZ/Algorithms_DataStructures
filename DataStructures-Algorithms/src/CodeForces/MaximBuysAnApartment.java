package CodeForces;

import java.util.Scanner;

public class MaximBuysAnApartment {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long n = s.nextLong();
        long k = s.nextLong();
        long mid = n / 2;
        long min = 0;
        long max = 0;

        if (n == k || k==0) {
            min=0;
            max=0;
        } else {


                if (k >= mid) {
                    max = n - k;
                    min=1;

                } else if (k==1&&n>2){
                    max = k + 1;
                    min=1;
                }
                else if (n-k==1){
                    max = 1;
                    min=1;
                }
                else {
                    max = k * 2;
                    min=1;

                }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
