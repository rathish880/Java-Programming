package Recursion;

public class linear_search_recursion {
    public static void main(String[] args) {
        int[] arr={1,9,2,8,7};
        System.out.println(linear(arr, 0, 8));
        
    }
    public static int linear(int[] arr,int index,int target){
        if(arr[index]==target)
         return index;
        return linear(arr,index+1,target);
    }
    
}
