package LEETCODE_problems;

public class leetcode_169 {
    public static void main(String[] args) {
       int[] arr={2,2,1,1,1,2,2};
       int result=majorityElement(arr); 
       System.out.println(result);
    }
    public static int majorityElement(int[] nums) {


        //using quick sort


    //    quick(nums,0,nums.length-1);
    //    int mid=nums.length/2;
    //    return nums[mid];
    
        
    // }
    // public static void quick(int[] arr,int low,int high){
    //     if(low>=high)
    //      return;
    //     int start=low;
    //     int end=high;
    //     int mid=start+(end-start)/2;
    //     int pivot=arr[mid];
    //     while(start<=end){
    //         while(arr[start]<pivot){
    //             start++;
    //         }while(arr[end]>pivot){
    //             end--;
    //         }
    //         if(start<=end){
    //             int temp=arr[start];
    //             arr[start]=arr[end];
    //             arr[end]=temp;
    //             start++;
    //             end--;
    //         }
    //         quick(arr,low,end);
    //         quick(arr,start,high);
    //     }

    //moore's voting Algorithm

    int majority=nums[0];
    int votes=1;
    for(int i=1;i<nums.length;i++){
        if(votes==0){
            votes++;
            majority=nums[i];
        }
        else if(majority==nums[i])
         votes++;
        else{
            votes--;
        }
    }
    return majority;

    }
    
}
