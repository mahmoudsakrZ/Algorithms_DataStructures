package geeksforgeeks;
import java.util.Scanner;
public class Trapping_Rain_Water {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int cases=s.nextInt();
        int [] arr;

        for (int i=0;i<cases;i++){
            int sum=0;
            int total =0;
            int num=s.nextInt();
            arr=new int[num];

            for (int j=0;j<num;j++){
                arr[j]=s.nextInt();
            }
            int y=min(arr[0],arr[num-1]);

            for (int z=1;z<num-1;z++){
                sum+=arr[z];
            }
            total=(y*(num-2))-sum;
            System.out.println(total);
        }
    }
    static int min(int x, int y){
        if(x<y)
            return x;
        else return y;
    }
}