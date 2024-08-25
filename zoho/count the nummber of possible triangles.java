package zoho;
import java.util.*;
class Solution
{
    //Function to count the number of possible triangles.
    static int findNumberOfTriangles(int arr[], int n)
    {
        // code here
    //     int count=0;
    //     for(int i=0;i<n-2;i++){
    //         for(int j=i+1;j<n-1;j++){
    //             for(int k=j+1;k<n;k++){
    //                 if(arr[i]+arr[j]>arr[k]){
    //                     count++;
    //                 }
    //             }
    //         }
    //     }
    //     return count;
    // }
    Arrays.sort(arr);
    int count=0;
        for(int k=n-1;k>=2;k--){
            int j=k-1;
            int i=0;
            while(i<j){
                if(arr[i]+arr[j]>arr[k]){
                    count=count+(j-i);
                    j--;
                }
                else{
                    i++;
                }
            }
        }
        return count;
    }
        
}