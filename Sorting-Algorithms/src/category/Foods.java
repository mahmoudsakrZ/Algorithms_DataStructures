package category;

import product.Price;

public class Foods implements Price {
    private int sal;

    public void setSal(int sal) {
        this.sal = sal;
    }
    @Override
    public double getPrice() {
        return sal*.2;

    }
}
