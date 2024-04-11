package Recursion;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr={2,9,0,1,6,7,11,3};
        selection(arr,arr.length,0);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void selection(int[] arr,int n,int index){
        //int start=arr[0];
        int max=0;
        for(int i=1;i<n-index;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
            int temp=arr[n-1];
            arr[n-1]=arr[max];
            arr[max]=temp;
            selection(arr,n-i,0);
        }

    }
    
}
