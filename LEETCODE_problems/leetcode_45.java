package LEETCODE_problems;

import java.util.Arrays;

public class leetcode_45 {
    public static void main(String[] args) {
        int[] nums={2,3,0,1,4};
        System.out.println(jump(nums));
    }
    public static int jump(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int destination=nums.length-1;
        int coverage=0;
        int index=0;
        int jump=0;
        for(int i=0;i<nums.length;i++){
            coverage=Math.max(coverage,i+nums[i]);
            if(i==index){
                index=coverage;
                jump++;
                if(coverage>=destination){
                    return jump;
                }
            }
        }
        return 0;
    }
    
}
