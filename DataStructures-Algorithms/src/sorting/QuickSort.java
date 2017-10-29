package sorting;

public class QuickSort {
    /*
    this method for calling QuickSort Method
     */
    public void quickSort(int arr[]){
        quickSort(arr,0,arr.length-1);
        print( arr);
    }

    /*
        in this method we divide the array and apply sorting for each part alone
        it work recursively
     */
    public void quickSort(int arr[], int start , int end){
        if(start<end){
            int index= partition(arr, start,end);
            quickSort(arr,start,index-1);
            quickSort(arr,index+1,end);
        }
    }

    /*
        in this method we choose the pivot EX the end index in the array
        and put it into ut's right position in the array where left side
        is less than the pivot and the right side is greater than the pivot
        and finally it return the index of the pivot in it's right position
     */

    private int partition(int[] arr, int start, int end) {
        int pivot=arr[end];
        int index=start;
        for (int i=start;i<end;i++){
            if(arr[i]<=pivot){
                arr=swap(arr,i,index);
                index++;
            }
        }
        swap(arr,end,index);
        return index;
    }

    /*
        it is a simple swap Method
     */
    private int [] swap(int arr[],int i, int index) {
        int temp=arr[i];
        arr[i]=arr[index];
        arr[index]=temp;
        return arr;
    }

    /*
       this method for printing sorted array
    */

    private void print(int[] arr) {
        System.out.println("---------- Sorted Array ----------");
        for (int x: arr){

            System.out.print(x+" ");
        }
    }
    /*
        the main method
     */
    public static void main(String[] args) {
        int arr[]={2,5,12,3,9,1,4,5,19,25,99,85,24,36,44,57};

       QuickSort a= new QuickSort();
        a.quickSort(arr);
    }
}
