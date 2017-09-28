package product;

public class Product {

    public static void getProductPrice(Price [] prices){
        double sum=0;
        for (Price p : prices){
             sum += p.getPrice();
        }
        System.out.println(sum);

    }




}
