import category.Clothes;
import product.Price;
import product.Product;

public class index extends Product{
    public static void main(String[] args) {
        Clothes c=new Clothes();
        c.setSal(20);
        Clothes c2=new Clothes();
        c2.setSal(40);
        Price[]prices ={c,c2};
        getProductPrice(prices);
    }
}
