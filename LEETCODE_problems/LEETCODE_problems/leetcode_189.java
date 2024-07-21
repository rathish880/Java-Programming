package LEETCODE_problems;

import java.util.Arrays;

public class leetcode_189 {
    public static void main(String[] args) {
        int[] nums={2,9,8,0,7,1,5,3};
        rotate(nums,3);
        System.out.println(Arrays.toString(nums));
    }
    
        public static void rotate(int[] nums, int k) {
            int[] arr=new int[nums.length];
            int len=nums.length;
            for(int i=0;i<len;i++){
                int index=(i+k)%len;
                arr[index]=nums[i];
            }
            for(int i=0;i<len;i++)
             nums[i]=arr[i];
            // for(int i=nums.length-k,j=0;i<nums.length;i++,j++)
            //  nums[j]=nums[i];
            
        }
    
    
}
