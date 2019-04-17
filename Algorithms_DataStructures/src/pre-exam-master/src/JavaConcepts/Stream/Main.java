package JavaConcepts.Stream;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

//        Set<JavaConcepts.String> set = JavaConcepts.Collections.singleton("Chicago");
//        System.out.println(set);
//
//
//        HashMap<JavaConcepts.String,JavaConcepts.String> x = new HashMap<>();
//        x.put( null , "1");
//        x.put( null , null);
//        x.put("C" , null);
//        x.put("B" , null);
//        x.put("A" , "XXX");
//        x.put("a" , "XXX");
//        x.put( "1" , "!");
//
//        System.out.println(x);
//
//
//        LinkedHashMap<Integer,JavaConcepts.String> z = new LinkedHashMap<>();
//        z.put(2,"aaa");
//        z.put(1,"aaa");
//        z.put(1,"xxx");
//
//        System.out.println(z);
//
//
//        TreeMap<Integer,JavaConcepts.String> t = new TreeMap<>();
//        t.put(1,"@");
//        t.put(5,"VV");
//        t.put(30,"CC");
//        t.put(20,"AA");
//        t.put(3,"BB");
//
//
//        System.out.println(t);


//        List<JavaConcepts.String> myList =
//                Arrays.asList("a1", "a2", "b1", "c2", "c1");
//
//        myList
//                .stream()
//                .filter(s -> s.startsWith("c"))
//                .map(JavaConcepts.String::toUpperCase)
//                .sorted()
//                .forEach(System.out::println);
//
//
//        myList.stream().map(p->p.toUpperCase()).forEach(x-> System.out.print(x + " .. "));

        /*
         *  1- Reduce Method
         * */
//        class Product {
//            int id;
//            JavaConcepts.String name;
//            float price;
//
//            public Product(int id, JavaConcepts.String name, float price) {
//                this.id = id;
//                this.name = name;
//                this.price = price;
//            }
//        }
//
//        List<Product> productsList = new ArrayList<Product>();
//        //Adding Products
//        productsList.add(new Product(1, "HP Laptop", 25000f));
//        productsList.add(new Product(2, "Dell Laptop", 30000f));
//        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
//        productsList.add(new Product(4, "Sony Laptop", 28000f));
//        productsList.add(new Product(5, "Apple Laptop", 90000f));
//        // This is more compact approach for filtering data
//        Float totalPrice = productsList.stream()
//                .map(product -> product.price)
//                .reduce(0.0f, (sum, X) -> sum + 1 + X);   // accumulating price
//
//        System.out.println(totalPrice);
//        // More precise code
//        float totalPrice2 = productsList.stream()
//                .map(product -> product.price)
//                .reduce(0.0f, Float::sum);   // accumulating price, by referring method of Float class
//        System.out.println(totalPrice2);
//
//
//        List number = Arrays.asList(2, 3, 4, 5);
//        ArrayList<Integer> square = (ArrayList<Integer>) number.stream().map(
//                (Object x) -> {
//                    Integer j = (Integer) x;
//                    return j * j;
//                }).collect(Collectors.toList());
//        for (Integer x : square) {
//            System.out.println(x);
//        }

        /*
         * 2- sort & Collect Method && sorted
         * */

//        List names = Arrays.asList("Reflection", "Collection", "JavaConcepts.Stream");
//        ArrayList<JavaConcepts.String> result = (ArrayList) names.stream().sorted().collect(Collectors.toList());
//        for (JavaConcepts.String s : result) {
//            System.out.println(s);
//        }

//        names.stream().


        /***
         * Coding game examples
         ***/


        Stream<String> x = Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> s.charAt(0)=='d');

        x.forEach(System.out::print);





    }
}
