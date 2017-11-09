package searching;

import dataStructures.LinkedList;

public class LinearSearch{

    /*
        this method for linear search  O(n)
     */
    public boolean search(int x , int []arr){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int [] arr={1,2,3};
        System.out.println(new LinearSearch().search(1,arr));

    }

}
