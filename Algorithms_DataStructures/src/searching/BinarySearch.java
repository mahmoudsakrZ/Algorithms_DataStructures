package searching;

public class BinarySearch {
    /*
        this method for binary search on sorted arrays O(log n)
     */
    public boolean search(int x, int arr[]){
        int start=0;
        int end=arr.length-1;
        int mid =start+end/2;

        while (start<=end){
            if(arr[mid]==x){
                return true;
            }else if(x<arr[mid]){
                end=mid-1;
                mid= (int) Math.ceil((start+end)/2.0);
            }else {
                start = mid+1;
                mid = (int) Math.ceil((start+end)/2.0);
            }
        }
    return false;
    }


    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,23,24,25,26};
        BinarySearch s=new BinarySearch();
        for (int i=1;i<27;i++){
            System.out.println(i+" "+s.search(i, arr));
        }

    }
}
