package CodeForces;

import java.util.*;

public class FairGame {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []set =new int[n];
        //fill the array with numbers
        for (int i=0;i<n;i++){
            set[i]=s.nextInt();
        }
        // sort the array
        Arrays.sort(set);

       if(set[0]==set[(n/2)-1]&&set[0]!=set[(n/2)]&&set[(n/2)]==set[(n-1)]){
           System.out.println("YES");
           System.out.print(set[0]+" ");
           System.out.println(set[n-1]);

       }else System.out.println("NO");

    }
}
