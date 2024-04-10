package Recursion;
import java.util.ArrayList;


public class indicesOfElements {

    public static void main(String[] args) {

        int[] arr={2,1,8,9,7,0,7};
        System.out.println(search(arr,7,0,new ArrayList<>()));
        
    }
    public static ArrayList<Integer> search(int[] arr,int target,int index,ArrayList<Integer> res){
        if(index==arr.length)
         return res;
        else if(arr[index]==target)
         res.add(index);
        
        return search(arr,target,index+1,res);

    }
    
}
