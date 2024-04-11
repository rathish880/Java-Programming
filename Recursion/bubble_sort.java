package Recursion;
import java.util.*;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,0,3,1,2,20,90,12};
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void bubble(int[] arr,int n,int i){
        if(n==0)
         return;
        if(i<n){ 
            if(arr[i]>arr[i+1])
            {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            //bubble(arr,n,i+1);
            }
            
            
              bubble(arr,n,i+1);
        } 
        else
            bubble(arr,n-1,0);
    }
       

    

    
}
