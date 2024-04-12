package Sorting;
import java.util.Arrays;
public class merge_sort_inPlace {
    public static void main(String[] args) {
        int[] arr={0,9,7,8,2,4,5,1};
        merge_sort1(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
        //System.out.println(merge_sort1(arr,0,arr.length));
        
    }
    public static void merge_sort1(int[] arr,int start,int end){
        if((end-start)==1)
         return;
        
        int mid= start+(end-start)/2;
        
        merge_sort1(arr,0,mid);
        merge_sort1(arr,mid,end);

        merge(arr,start,mid,end);

    }
    public static void merge(int[] arr,int start,int mid,int end){
        int i=start;
        int j=mid;
        int k=0;
        int[] mix=new int[end-start];
        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
                k++;
            }
            else{
                mix[k]=arr[j];
                j++;
                k++;
            }
        }   
        while(i<mid){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<end){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for(int r=0;r<mix.length;r++){
            arr[start+r]=mix[r];

        }
    }
    
}
 
