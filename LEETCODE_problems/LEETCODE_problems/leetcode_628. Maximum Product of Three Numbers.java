
import java.util.*;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        if(nums[nums.length-1]<0){
            return nums[nums.length-1]* nums[nums.length - 2] * nums[nums.length - 3];
        }
        
        if (nums[0] * nums[1] > nums[nums.length - 2] * nums[nums.length - 3]) {
            return nums[0] * nums[1] * nums[nums.length - 1];
        }
        int product = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        return product;

    }
}