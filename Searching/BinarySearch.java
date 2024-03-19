package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={12,16,20,29,30,33,48,58,64,78,90};
        int target=90;
        int ans=binarysearch(arr, target);
        System.out.println(ans);
        
    }
    private static int binarysearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
              end=mid-1;
            else if(target>arr[mid])
              start=mid+1;
            else 
              return mid;
            
        }
        return -1;

    }
    
}
