package Concepts;

public class     {

    public static void main (String args[]){
        int[] arr={1,3,7,9,10,15,19};
        int ceiling=ceiling(arr,0,arr.length-1,20);
        System.out.println(ceiling);
    }
    public static int ceiling(int arr[],int start,int end,int target){
        // int start=start;
        // int end =end;
        
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return arr[mid];
            else if(arr[mid]>target)
                end=mid-1;
            else
                start=mid+1;
        }
        return arr[start];
    }

    
}
