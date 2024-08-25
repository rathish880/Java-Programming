package zoho;


import java.util.*;
public class zeroes_to_end_of_the_array {
    public static void main(String[] args) {
        int[] arr={2,9,0,8,0,0,0,6,1};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                swap(arr,i,j);
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
