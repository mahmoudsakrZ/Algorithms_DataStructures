package JavaConcepts.Enum;

// include enum inside class


public class Test {


    public static void main(String[] args) {

        for(Season c : Season.values()){
            System.out.println(c );
        }
    }



    enum  Season { WINTER, SPRING, SUMMER, FALL }

}
