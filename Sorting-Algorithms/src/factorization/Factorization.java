package factorization;

import java.util.ArrayList;
import java.util.List;

public class Factorization {
    static List l=new ArrayList();
    public static void main(String[] args) {
        List ll=getPrimeFactors(330);
        for (Object i:ll){
            System.out.println(i);
        }
    }
    public static List getPrimeFactors(int n){

        for (int i=2;i*i<=n;i++){
            while (n%i==0){
                l.add(i);
                n/=i;
            }
        }
        if(n>1){
            l.add(n);
        }
        return l;
    }
}
