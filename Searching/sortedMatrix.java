package Searching;

import java.util.*;

public class sortedMatrix {
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3},{4,5,6},{7,8,9}
        };
        System.out.println(Arrays.toString(search(arr, 9)));
        
    
    }

    private static int[] binarySearch(int[][] arr,int row,int cstart,int cend,int target){
        int mid=cstart+(cend-cstart)/2;
        while(cstart<=cend){
            if(arr[row][mid]==target)
             return new int[]{row,mid};
            else if(arr[row][mid]<target)
             cstart=mid+1;
            else
             cend=cend-1;
             

        }
        return new int[]{-1,-1};
        

        
    } 



    private static int[] search(int[][] arr,int target){
        int row=arr.length;
        int col=arr[0].length;

        if(row==1){
            return binarySearch(arr,0,0,col-1,target);

        }
        int rstart=0;
        int rend=row-1;
        int cmid=col/2;
        while(rstart<=rend-1){
            int rmid=rstart+(rend-rstart)/2;
            if(arr[rmid][cmid]==target)
             return new int[]{rmid,cmid};
            else if(arr[rmid][cmid]<target)
                rstart=rmid+1;
            else
             rend=rmid-1;
            }
        //return new int[]{-1,-1};


            //check the remaining two columns

        if(arr[rstart][cmid]==target)
            return new int[]{rstart,cmid};
        if(arr[rstart+1][cmid]==target)
            return new int[]{rstart+1,cmid};

            //search in 1st half
        if(target<=arr[rstart][cmid-1]){
            return binarySearch(arr,rstart,0,cmid-1,target);

        }

            //search in 2nd half
        if(target<=arr[rstart][cmid+1]&& target<=arr[rstart][col-1]){
            return binarySearch(arr,rstart,cmid+1,col-1,target);

        }

            //search in 3rd half
        if(target<=arr[rstart+1][cmid-1]){
            return binarySearch(arr,rstart+1,0,cmid-1,target);

        }

        //search in 4th half
        if(target<=arr[rstart+1][cmid+1]){
            return binarySearch(arr,rstart+1,cmid+1,col-1,target);
        }

        return new int[]{-1,-1};
    }
}

