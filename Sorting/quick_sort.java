
package Sorting;
import java.util.Arrays;

public class quick_sort {
    public static void main(String[] args) {
        int[] arr={2,1,0,9,3,7,4,6};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void quick(int[] nums,int low,int high){
        if(low>=high){
            return;
        }
        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
        int pivot=nums[mid];

        while(start<=end){
            while(nums[start]<pivot){
                start++;
            }
            while(nums[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
           
        }
        quick(nums,low,end);
        quick(nums,start,high);


    }
}
    