package JavaConcepts.Operators;

public class Test {

    public static void main(String[] args) {
        int x = 11;



/*

~ (bitwise compliment)
  > is Ones Complement
   Operator is unary and has the effect of 'flipping' bits.

*/

        System.out.println("bitwise compliment of " + Integer.toBinaryString(x) + " is  " + Integer.toBinaryString((~x))
                + " number: " + (~x));


// ^ (bitwise XOR)


        System.out.println("bitwise XOR of " + Integer.toBinaryString(20) + "And " + Integer.toBinaryString(30) + " is " +
                " " + Integer.toBinaryString((20^30))
                + " number: " + (20^30));


// SHIFT

        // left Shift << :: larger number


        System.out.println("left shift of " + Integer.toBinaryString(x) + " is  " + Integer.toBinaryString((x << 2))
                + " number: " + (x << 2));

        // right shift >>  :: smaller number

        System.out.println("right shift of " + Integer.toBinaryString(x) + " is  " + Integer.toBinaryString((x >> 3))
                + " number: " + (x >> 3));


        // Java Shift Operator : >> vs >>>

        //For positive number, >> and >>> works same

        System.out.println("right >> shift of " + Integer.toBinaryString(x) + " is  " + Integer.toBinaryString((x >>
                3)) + " number: " + (x >> 3));

        System.out.println("right >>> shift of " + Integer.toBinaryString(x) + " is  " + Integer.toBinaryString((x
                >>> 3)) + " number: " + (x >>> 3));


        //For negative number, >>> changes parity bit (MSB) to 0

        x = -10;

        System.out.println("right >> shift of " + Integer.toBinaryString(x) + " is  " + Integer.toBinaryString((x >>
                3)) + " number: " + (x >> 3));

        System.out.println("right >>> shift of " + Integer.toBinaryString(x) + " is  " + Integer.toBinaryString((x
                >>> 3)) + " number: " + (x >>> 3));


    }
}
