package sorting;

public class BubbleSort {

/// it is not actually bubble sort
    public static int [] bubbleSort2(int arr []){
        int n=arr.length;
        int count=0;
        for (int i=0;i<n;i++){
            for (int j=1;j<n-1;j++){
                count++;
                if(arr[j-1]>arr[j]){
                    arr=swap(arr,j,j-1);
                }
            }
        }
        System.out.println("Count : "+count);

        return arr;
    }

// it is the real bubble sort sort from the end of the array to the beginning of the array
    public static  int [] bubbleSort(int [] arr){
        int n=arr.length-1;
        int count=0;

        for (int i=0;i<arr.length;i++){
           for (int j=n;j>i;j--){
               count++;
               if(arr[j]<arr[j-1]){
                  arr= swap(arr,j,j-1);

               }
           }
        }
        System.out.println("Count : "+count);
        return arr;
    }

    // it is the real bubble sort sort from the start of the array to the end of the array
    // using swap flag for improving complexity of the sorting algorithm
    public static int [] bubbleSort3(int arr[]){
        int count=0;
        int n=arr.length-1;

        for (int i=n;i>=0;i--){
            boolean swap=false;
            for (int j=0;j<i;j++){
                count++;
                if(arr[j]>arr[j+1]){
                    arr=swap(arr,j,j+1);
                    swap=true;
                }
            }
            if (!swap){
                break;
            }
        }
        System.out.println("Count : "+count);

        return arr;

    }

    public static int[] swap(int []arr ,int i , int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={8,6,1,7,2,3,4,5,6,6,1,7,2,3,4,5,6,6,1,7,2,3,4,5,6,6,1,7,2,3,4,5,6,6,1,7,2,3,4,5,6};
        int arr2[]={10,9,8,1,2,6,7,7};
        int arr3[]={1,2,3,4,5,7,8};
        for(int x:bubbleSort3(arr3)){
            System.out.println(x +" ");
        }
    }

}
