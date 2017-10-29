package sorting;
/*
    created by Mahmoud Ragab
    21/10/2017
 */
public class MergeSortImpl {

    // this method for calling the merge sort
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
    public void printSortedArray(int arr[]){
        System.out.println("-------- The array successfully sorted !! --------");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }


    public static void main(String[] args) {
        int arr[]={5,99,12,1,2,6,17,52,21};
        MergeSortImpl mergeSort=new MergeSortImpl();
        int sortedArr[]=mergeSort.mergeSort(arr);
        mergeSort.printSortedArray(sortedArr);
    }
}
