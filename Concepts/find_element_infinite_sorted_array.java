package Concepts;

public class find_element_infinite_sorted_array {

    public static void main(String[] args) {
        int[] arr={12,16,20,29,30,33,48,58,64,78,90};
        int target=33;
        // int ans=binarysearch(arr, target);
        int ans=mid(arr,target);
        System.out.println(ans);
        
    }
    public static int mid(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarysearch(arr,target,start,end);
    }
    private static int binarysearch(int[] arr, int target,int start,int end){
        // int start=0;
        // int end=arr.length-1;
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
