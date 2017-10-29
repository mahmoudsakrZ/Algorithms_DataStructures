public class demo implements demox {
    public static void main(String[] args) {
        System.out.println("Start Here !! ");
        demo d=new demo();
        d.methodx();
    }
}
interface demox{
    default  public void methodx(){
        System.out.println("Hello World !!");
    }
}
interface Mahmoud{
    public void sayHello();
}






