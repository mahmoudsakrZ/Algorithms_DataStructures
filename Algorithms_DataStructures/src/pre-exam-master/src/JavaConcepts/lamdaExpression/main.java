package JavaConcepts.lamdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {

    public static void main(String[] args) {


        // create Custom Functional Interface

        Addable addable = (int x, int y) -> x + y;

        System.out.println(addable.add(5, 9));


        /**
         *
         * lamda expression in Event Listener (Swing)
         **/


//        JTextField tf = new JTextField();
//        tf.setBounds(50, 50, 150, 20);
//        JButton b = new JButton("click");
//        b.setBounds(80, 100, 70, 30);
//
//        // lambda expression implementing here.
//        b.addActionListener(e -> {
//            tf.setText("hello swing");
//        });
//
//        JFrame f = new JFrame();
//        f.add(tf);
//        f.add(b);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setLayout(null);
//        f.setSize(300, 200);
//        f.setVisible(true);


        /**
         *
         * lamda Expression in Collection
         *
         */




        class Product{
            int id;
            String name;
            float price;
            public Product(int id, String name, float price) {
                super();
                this.id = id;
                this.name = name;
                this.price = price;
            }
        }

        List<Product> list=new ArrayList<>();

        //Adding Products
        list.add(new Product(1,"HP Laptop",25000f));
        list.add(new Product(3,"Keyboard",300f));
        list.add(new Product(2,"Dell Mouse",150f));

        System.out.println("JavaConcepts.Sorting on the basis of name...");

        // implementing lambda expression
        Collections.sort(list,(p1, p2)->{
            return p1.name.compareTo(p2.name);
        });
        for(Product p:list){
            System.out.println(p.id+" "+p.name+" "+p.price);
        }


    }
}
