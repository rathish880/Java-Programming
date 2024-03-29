package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr={0,-23,9,7,98,21};
        Insertion(arr);
        System.out.println(Arrays.toString(arr));

        
    }

    private static void Insertion(int[] arr){
        for(int i=0;i<=arr.length-2;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else 
                 break;
            }
        }

    }
}
