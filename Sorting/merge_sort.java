package Sorting;

import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args) {
        int[] arr={2,0,9,6,7,8,10};
        int[] sns=merge_sort(arr);
        System.out.println(Arrays.toString(sns));
        //System.out.println(Arrays.toString(arr));

        
    }
    public static int[] merge_sort(int[] arr){
        if(arr.length==1)
         return arr;
        int mid=arr.length/2;
        int[] left=merge_sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right=merge_sort(Arrays.copyOfRange(arr, mid, arr.length));
        
        return merge(left,right);


    }
    public static int[] merge(int[] left, int[] right){
        int i=0;
        int j=0;
        int k=0;
        int[] mix=new int[left.length+right.length];
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;
                k++;
            }
            else{
                mix[k]=right[j];
                j++;
                k++;
            }
        }
        while(i<left.length){
            mix[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            mix[k]=right[j];
            j++;
            k++;
        }
        return mix;



    }
    
}
