package JavaConcepts.String.StringBuilder;

public class main {


    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("omar");
        System.out.println(s.toString());

        StringBuffer m = new StringBuffer("omar");

/*
    You are comparing the references to the StringBuffer objects rather than the actual strings within the
    StringBuffer.

    in another side :
        JavaConcepts.String use equals in Object Class so it compare the values in objects
*/
        boolean x = s.equals(m);
        System.out.println(x);


        // so the solution is ------>

        System.out.println(s.toString().equals(m.toString()));

    }
}
