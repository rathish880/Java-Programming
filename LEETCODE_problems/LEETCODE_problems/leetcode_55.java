package LEETCODE_problems;

public class leetcode_55 {
    public static void main(String[] args) {
        int[] nums={3,2,1,0,4};
        System.out.println(canJump(nums));
        
    }
    public static boolean canJump(int[] nums) {
        int len=nums.length;
        int j=len-1;   // here the index posution represents the number of jumps taken
        for(int i=len-2;i>=0;i--){
            if(nums[i]+i >= j){
                j=i;
            }
            
        }
        if(j==0)
            return true;
        return false;
    }
    
}
