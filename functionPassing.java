import java.util.*;

public class functionPassing {
    public static void main(String args[]){
        int nums[]={2,3,5,7,2,1,9};
        System.out.println(Arrays.toString(nums));

        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0]=9;
    }
    
} 
