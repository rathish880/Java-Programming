package LEETCODE_problems;

public class leetcode_198 {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{2,7,9,3,1}));
        
    }
    public static int rob(int[] nums) {
        if(nums.length<2)
         return nums[0];
        int[] total=new int[nums.length];
        total[0]=nums[0];
        total[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            total[i]=Math.max(total[i-2]+nums[i],total[i-1]);
        }
        return total[nums.length-1];

    }
}
