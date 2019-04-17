package JavaConcepts.Collections.List;

import java.util.Collections;
import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(5);

        Collections.sort(stack);
        System.out.println(stack);

        Collections.binarySearch(stack,2);


    }

}
