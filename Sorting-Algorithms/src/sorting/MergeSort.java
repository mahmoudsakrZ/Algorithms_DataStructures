package sorting;

public class MergeSort {

    public static void main(String[] args) {
        MergeSort s=new MergeSort();
        int left[]={2,5,9,15,70};
        int right[]={1,3,4,10,11,20,30,35,38};
        int arr[]=null;
        arr=s.merge(left,right);
        // 1 2 3 4 5 9 10 15 20 70
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public int [] merge(int arr [], int n){

        int mid =n/2;
        int []left=new int[mid];
        int []right=new int[n-mid];
        while(n>1){
            for (int i=0;i<mid;i++){
                left[i]=arr[i];
            }
            for (int i=mid;i<n;i++){
                right[i-mid]=arr[i];
            }


        }

        return null ;
    }


    public int [] merge(int left[],int right[]){
        int leftSize=left.length;
        int rightSize=right.length;
        int arrSize=leftSize+rightSize-1;
        int arr[]=new int[arrSize];
        int l=0;
        int r=0;
        for (int i=0;i<arrSize;i++){
            if (left[l]<=right[r]){
                arr[i]=left[l];
                l++;
            }else if(right[r]<=left[l]) {
                arr[i]=right[r];
                r++;
            }
        }
        return arr;
    }




}
