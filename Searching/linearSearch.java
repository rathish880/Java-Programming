package Searching;
import java.util.*;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int[] arr=new int[10];
        int target=20;
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();

        }
        int ans=linear(arr, target);
        System.out.println(ans);
    

    }

    static int linear(int[] arr,int index){

        if(arr.length==0)
         return -1;
        for(int element:arr){
            if(element==index)
             return element;
        }
        return -1;

    }
    
}
