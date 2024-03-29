package Sorting;
import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arrr={5,3,2,4,1};

        cycle(arrr);
        System.out.println(Arrays.toString(arrr));
        
    }

    private static void cycle(int[] arr){
        int i=0;
        //int crtindex=arr[i]-1;
        while(i<arr.length){
            int crtindex=arr[i]-1;
            if(arr[i]!=arr[crtindex]){
                int temp=arr[i];
                arr[i]=arr[crtindex];
                arr[crtindex]=temp;
            }
            else{
                i++;
            } 
        }
    }
    
}
