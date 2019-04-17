package operators;

public class example {

    public static void main(String args[]) {
        int a = 60;	/* 60 = 0011 1100 */

        System.out.println(Integer.toBinaryString(a));

        int b = 13;	/* 13 = 0000 1101 */
        int c = 0;

        System.out.println(Integer.toBinaryString(b));

        // 1- AND

        c = a & b;        /* 12 = 0000 1100 */
        System.out.println("a & b = " + c );

        // 2- OR

        c = a | b;        /* 61 = 0011 1101 */
        System.out.println("a | b = " + c );


        // 3- XOR

        c = a ^ b;        /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c );



        /*
         4- bitwise compliment operator
             ~a : means not a : 0 -> 1 ,,,  1 -> 0
             it also = two's complement-1
             two's complement is negative of num
        */
        c = ~a;           /* a = 60 = 0011 1100   -->    -61 = 1100 0011 */
        System.out.println("~a = " + c );

        // another example

        int k = 10;
        System.out.println( "  K  -> " +Integer.toBinaryString(k));
        k = ~k;
        System.out.println( "compliment of K : " + (k)); // -11

        // so to negative of 10
        System.out.println(k+1);


        /*
        * 5- left shift <<
        *   Binary Left Shift Operator. The left operands value is moved left by
        *   the number of bits specified by the right operand.
        *
        *  By3mel shift n7yt el left LL  bits bas mesh bydya3 bits
        *  ex : 0101 0101 << 1  ===>   1010 1010
        *
        *
         *  */


        c = a << 2;       /*  a = 60 = 0011 1100   -->   240 = 1111 0000 */
        System.out.println("a << 2 = " + Integer.toBinaryString(c) );
        System.out.println("a << 2 = " + c );

        // another example
        int x = 10;
        System.out.println(Integer.toBinaryString(x ));
        int j = x << 2;       /*  a = 60 = 0011 1100   -->   240 = 1111 0000 */
        System.out.println("j << 2 = " + Integer.toBinaryString(j) );
        System.out.println("j << 2 = " + j );


        /*
        * 6- RIGHT SHIFT : Signed
        * 3aks el LEFT
        * */

        c = a >> 2;       /* a = 60 = 0011 1100   -->  15 = 1111 */
        System.out.println("a >> 2  = " + c );


        /*
        * 7- zero fill right shift : UnSigned
        *
        * howa howa El RIGHT SHIFT bas bdal ma byshel el zeros elly 3ala el shemal bysebha zay ma hya
        *
        * */

        c = a >>> 2;      /* a = 60 = 0011 1100   -->  15 = 0000 1111 */
        System.out.println("a >>> 2 = " + c );
        System.out.println(Integer.toBinaryString(c));


        // difference between >> , >>>


        int m = -5;
        System.out.println(" Signed  " + Integer.toBinaryString( m));
        System.out.println(" Signed  >> 2 : " + Integer.toBinaryString(m >> 2)); // will but one's for shifted bits
        System.out.println(" Signed  >>> 2 : " + Integer.toBinaryString(m >>> 2)); // will but zero's for shifted bits


        // will be 32 ones
        int pp = -1;
        System.out.println(Integer.toBinaryString(pp >>> 30));
        System.out.println(Integer.toBinaryString(pp >>> 28));
        System.out.println(Integer.toBinaryString(pp >>> 25));
    }

}
