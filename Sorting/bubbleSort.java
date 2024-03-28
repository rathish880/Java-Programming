package Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {

        int[] rr={2,5,1,0,8,9,2,5,77,1};
        bubble(rr);
        System.out.println(Arrays.toString(rr));

    }
    private static void bubble(int[] arr){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    
}
