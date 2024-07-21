package LEETCODE_problems;
import java.util.Arrays;

public class leetcode_88 {
    public static void main(String[] args) {
        int[] nums1={2,3,4,0,0,0};
        int[] nums2={1,5,8};
        merge(nums1,nums1.length/2,nums2,nums2.length);
        System.out.println(Arrays.toString(nums1));
    }
    
        public static void merge(int[] nums1, int m, int[] nums2, int n) {
           int j=0;
            for(int i=m;i<nums1.length;i++){
                nums1[i]=nums2[j];
                j++;
            }
            
            for(int i=0;i<nums1.length;i++){
                for(int k=0;k<nums1.length-1;k++){
                    if(nums1[k]>nums1[k+1]){
                        int temp=nums1[k];
                        nums1[k]=nums1[k+1];
                        nums1[k+1]=temp;
                    }
                }
            }
          
    
            }
    
            
        
    
    
}
