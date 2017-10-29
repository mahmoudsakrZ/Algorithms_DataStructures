package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={8,6,1,7,2,3,4,5,6};

        for(int x:selectionSort(arr)){
            System.out.println(x +" ");
        }

    }
    public static int [] selectionSort(int arr []){
        for (int i=0;i<arr.length;i++){
            int min =arr[i];
            int index=i;
            for (int j=i+1;j<arr.length;j++){
                if(min>arr[j]){
                    min=arr[j];
                    index=j;
                }

            }
            arr[index]=arr[i];
            arr[i]=min;
        }
    return arr;
    }

}
