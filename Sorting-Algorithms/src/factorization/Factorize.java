package factorization;

public class Factorize {
    public static void main(String[] args) {
        Factorize f=new Factorize();
        f.generateDevisors(16);
    }
    public void generateDevisors(int n){

        for (int i=1;i*i<=n;i++){
            int first=0, second=0;
            if(n%i==0){
                first=i;
                second=n/i;
            }
            System.out.println(first);
            System.out.println(second);
        }
    }
}
