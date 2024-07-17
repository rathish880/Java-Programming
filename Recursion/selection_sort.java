package Recursion;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr={2,9,0,1,6,7,11,3};
        selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr);
        
    }
    public static void selection(int[] arr,int n,int index,int max){
        //int start=arr[0];
        //int max=0;
        //for(int i=1;i<n-index;i++){
            if(n==0)
             return;
            if(index<n){

                if(arr[index]>arr[max]){
                    //max=i;
                    selection(arr,n,index+1,index);
                }
                else{
                    selection(arr,n,index+1,max);

                } 
                    
            }
            else{
                int temp=arr[max];
                arr[max]=arr[n-1];
                arr[n-1]=temp;
                selection(arr,n-1,0,0);
            }

            }
            
            

    }
    

