import java.util.Arrays;

public class leetcode_34 {
    public static void main (String args[]){
        int target=7;
        int[] arr={1,2,5,7,7,7,7,10,23};
        int[] ans={-1,-1};
        ans[0]=search(arr,0,arr.length-1,target,true);
        ans[1]=search(arr,0,arr.length-1,target,false);
        System.out.println(Arrays.toString(ans));

    }
    public static int search(int[] arr,int start,int end,int target,boolean flag){
        int ans=0;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            } 
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                ans=mid;
                if(flag){   
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
