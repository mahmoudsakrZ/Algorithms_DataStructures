package CodeForces;

import java.util.Scanner;
import java.util.regex.Matcher;

/**
 * Created by Mahmoud Ragab on 11/26/2017.
 */
public class PizzaSeparation {

    public static void main(String[] args) {
        int first=0, second =0;
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int [] pizza=new int [num];

        for(int i=0;i<num;i++){
            pizza[i]=s.nextInt();
        }
        if(num==1){
            System.out.println(pizza[0]);
        }else if(num==2){
            System.out.println(Math.abs(pizza[0]-pizza[1]));
        }else if(num>2){
            pizza=new PizzaSeparation().mergeSort(pizza);
            for (int i=0;i<num;i++){

            }
            System.out.println(Math.abs(first-second));

        }


    }




    public int[] mergeSort(int arr []){
        mergeSort(arr, new int[arr.length],0,arr.length-1);
        return arr;
    }

    // this method for divide the array into two parts tell reach to
    // only one element in the right side and one element in the left side

    public void mergeSort(int arr[],int temp[],int left, int right){
        if(left >= right){
            return;
        }

        int mid =(left+right)/2;
        mergeSort(arr,temp,left,mid);
        mergeSort(arr,temp,mid+1,right);


        mergeHalves(arr ,temp, left, right);

    }

    private void mergeHalves(int[] arr, int temp[],int leftStart, int rightEnd) {
        int leftEnd =(leftStart+rightEnd)/2;
        int rightStart=leftEnd+1;
        int size =rightEnd-leftStart+1;


        int left=leftStart;
        int right=rightStart;
        int index=leftStart;



        while (left<=leftEnd && right<=rightEnd){
            if(arr[left]<arr[right]){
                temp[index]=arr[left];
                left++;
            }else {
                temp[index]=arr[right];
                right++;
            }
            index++;
        }

        System.arraycopy(arr, left,temp,index,leftEnd-left+1);
        System.arraycopy(arr, right,temp,index,rightEnd-right+1);
        System.arraycopy(temp,leftStart,arr,leftStart,size);


    }


}
