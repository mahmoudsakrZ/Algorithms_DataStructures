package CodeForces;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class TomRiddlesDiary {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Set set=new LinkedHashSet();
        int size=0;
        for (int i=0;i<n;i++){

            set.add(s.next());
            if(set.size()==size){
                System.out.println("YES");
            }else{
                System.out.println("NO");
                size++;
            }

        }

    }
}
