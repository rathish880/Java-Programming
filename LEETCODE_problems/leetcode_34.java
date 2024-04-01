package LEETCODE_problems;

import java.util.Arrays;

public class leetcode_34 {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int[] result= searchRange(arr,8);
        System.out.println(Arrays.toString(result));
        
    }
    public static int[] searchRange(int[] nums, int target){
        int left=binary(nums,target,true);
        int right=binary(nums,target,false);
        return new int[]{left,right};

    }
    private static int binary(int[] nums,int target,boolean leftbias){
        int start=0;
        int end=nums.length-1;
        int i=-1;
        if(nums.length==0){
            return -1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target)
             end=mid-1;
            else if(nums[mid]<target)
             start=mid+1;
            else{
                i=mid;
                if(leftbias){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            } 
             
             
        
        }
        return i;
    }

    
}
