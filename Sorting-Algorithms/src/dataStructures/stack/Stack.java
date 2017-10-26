package dataStructures.stack;

import java.util.EmptyStackException;

public class Stack <T>{
    T arr[];
    T temp[];
    private int top;
    public Stack(){
        arr=(T[]) new Object[2];
        top=-1;
    }

    // stack main operations methods implementation
    //this method for adding new element to the stack
    public void push(T x){
        top++;
        if(top<arr.length){
            arr[top]=x;
        }else {
            arr=resize(arr);
            arr[top]=x;
        }

    }
    // this method for removing and return the top element in the array
    public T pop(){
        if(top==-1){
            System.out.println("Stack is Empty ");
            return null;
        }
           // System.out.println(arr[top]);
            return arr[top--];
    }
    // this method for resizing the size of the stack of it
    // exceed the size of the array we store our data in it
    private T[] resize(T [] array){

        temp=(T[]) new Object[array.length];
        arr=(T[]) new Object[array.length*2];
        int index=0;
        for (T x: array){
            arr[index]=x;
            index++;
        }
        System.out.println("Resize Done ");
        return arr;
    }


    // this method for testing if the stack has more element
    public boolean hasNext(){
        if(top>-1)
            return true;
        else
            return false;
    }
    // this method return the size of the stack
    public int size(){
        return top+1;
    }
    // this method for returning the last element in the stack without removing it
    public T peak(){
        return arr[top];
    }

    public static void main(String[] args) {
        Stack<String> s=new Stack<String>();
      //  s.pop();
        s.push("1");
        s.push("2");
        s.push("3");
        s.push("4");
        s.push("5");
        s.push("6");
        s.push("7");
        s.push("8");
        s.push("9");
        System.out.println("peak operation "+s.peak());

       while (s.hasNext()){
           System.out.println(s.pop());
       }


    }
}
