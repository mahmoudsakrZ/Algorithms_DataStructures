package problemSolving.PascalTriangle;

import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        int line = 5;
        for (int i = 0; i < line ; i++) {
            for (int x = i ; x < line ; x++ )
                System.out.println(NCR(new BigInteger(""+i),new BigInteger(""+x)).toString());

        }
    }

    public static BigInteger fact(BigInteger n) {
        BigInteger f = BigInteger.ONE;
        while (!n.equals(BigInteger.ZERO)) {
            f = f.multiply(n);
            n = n.subtract(BigInteger.ONE);
        }
        return f;
    }

    public static BigInteger NCR(BigInteger n, BigInteger k) {

        return fact(n).divide(fact(n.subtract(k)).multiply(fact(k)));

    }

//    public String NCR(int n, int k)
//    {
//        return NCR(new BigInteger(n + ""), new BigInteger(k + "")) + "";
//    }


// another sol
//    public String get(int l, int c) {
//        if (c > l - c) {
//            c = l - c;
//        }
//        BigInteger b = BigInteger.ONE;
//        for (int i = 1, m = l; i <= c; i++, m--)
//            b = b.multiply(new BigInteger(m + "")).divide(new BigInteger(i + ""));
//
//        return b.toString();
//    }


}
