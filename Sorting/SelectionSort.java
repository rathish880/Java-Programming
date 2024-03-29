package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={1,3,9,0,4,-43,6};

        for(int i=0;i<arr.length;i++){
            int last=arr.length-1-i;
            int max=0;
            for(int j=1;j<=last;j++){
                if(arr[max]<arr[j]){
                    //max=arr[j];
                    max=j;

                }
                 
            }
            int temp=arr[max];
            arr[max]=arr[last];
            arr[last]=temp;



            }
            System.out.println(Arrays.toString(arr));
        }
        
    
}
    

