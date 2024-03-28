package Searching;

import java.util.Arrays;

public class row_column_matrix {
    public static void main(String[] args) {
        int[][] arr={
            {2,12,22},
            {3,13,23},
            {4,14,24}
        };
        int target=29;
        System.out.println(Arrays.toString(Search(arr,target)));

        }
        public static int[] Search(int[][] arr,int target){
            int row=0;
            int column=arr.length-1;
            while(row<arr.length && column>=0){
                if(arr[row][column]==target){
                    return new int[]{row,column};
                }
                else if(arr[row][column]<target){
                    row++;
                }
                else if(arr[row][column]>target){
                    column--;
                }
            }
            return new int[]{-1,-1};     
                  
            
        
    }
    }
        
    
