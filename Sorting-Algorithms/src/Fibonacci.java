import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Timer;

public class Fibonacci {
    public static void main(String[] args) {
      /*  int index =0;
        while (true){
            System.out.println(findFibonacci(index));
            index++;
        }*/
       System.out.println("First start : "+ new Date().toString());
       System.out.println("Fastest solution for fibonacci : "+fib(50));
       System.out.println("First end   : "+ new Date().toString());
       System.out.println("------------------------------------------------");
       System.out.println("second  start : "+ new Date().toString());
       System.out.println("Slowest solution for fibonacci : "+findFibonacci(50));
       System.out.println("second end    : "+ new Date().toString());

    }

    public static long findFibonacci(int x){
        if(x==0) return 0;
        else if(x<=2) return 1;
        return findFibonacci(x-1)+findFibonacci(x-2);
    }

    static long arr[];
    int index =0;
    public static long fib(int term)
    {
       arr=new long[term+1];
       arr[0]=0;
       arr[1]=1;
       for (int i=2;i<=term;i++){
           arr[i]=arr[i-1]+arr[i-2];
       }
       return arr[term];
    }
}
