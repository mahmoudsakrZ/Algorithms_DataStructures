package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={8,5,3,7,2,4,5,8};
        InsertionSort s=new InsertionSort();
        int [] sortedArr = s.sort(arr);
        for (int i=0;i<sortedArr.length;i++)
            System.out.println(sortedArr[i]);
    }


    public int[] sort(int[] arr){
       // int numofIterations=0;
        for (int i=1;i<arr.length;i++){
            int count =i;
            for (int j=i-1;j>=0;j--){
            //    numofIterations++;
                if(arr[count] < arr[j]){
                    arr=swap(arr, count, j);
                    count--;
                }else continue;
            }
        }
       // System.out.println("Count :"+numofIterations);
        return arr;
    }

    public int[] swap(int []arr ,int i , int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }
}
