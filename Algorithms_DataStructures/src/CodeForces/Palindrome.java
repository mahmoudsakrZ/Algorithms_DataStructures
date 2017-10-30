package CodeForces;
/*
    this problem for finding the largest 2 numbers A,B that consist of
    3 digits where A*B is a Palindrome   it will be [9]
 */
public class Palindrome {
     int arr[];
     int res[];
    public Palindrome() {
        arr= new int[]{0, 0};
    }

    public  boolean test(String word){
        boolean flag =false;
        for (int i=0;i<word.length()/2;i++){
            if(word.charAt(i)==word.charAt(word.length()-i-1)){
                flag=true;
            }else {
                flag=false;
                return false;
            }
        }
        return flag;
    }
    public  int[] max(int x, int y){

        if(x*y>(arr[0]*arr[1])){
            arr[0]=x;
            arr[1]=y;
        }
        return arr;
    }
    public static void main(String[] args) {
        Palindrome palindrome=new Palindrome();
       // OterLoop:
        for (int i=999;i>=100;i--){
            for (int j=999;j>=100;j--){
                if(palindrome.test((i*j)+"")){
                    /*System.out.println(i);
                    System.out.println(j);
                    break OterLoop;*/

                    palindrome.res= palindrome.max(i,j);

                }


            }

        }
     //   System.out.println(palindrome.res[0]);
      //  System.out.println(palindrome.res[1]);
    }
}
