package Searching;
import java.util.*;

public class binarysearh_using_Recursion {
    public static void main(String[] args) {
        int[] arr={-1,3,10,29,90,100,110};
       // int t=100;
       
        System.out.println(Arrays.toString(arr));
        System.out.println(search(arr,-1,0,arr.length-1));
        
    }
    public static int search(int[] arr ,int target,int start,int end){
        int mid=start+(end-start)/2;
        if(start>end){
            return -1;
        }
        if(arr[mid]==target)
         return mid;
        else if(arr[mid]>target)
         return search(arr,target,start,mid-1);
        else 
         return search(arr,target,mid+1,end);
         
    }
    
}
