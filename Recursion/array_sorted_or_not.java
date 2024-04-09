package Recursion;

public class array_sorted_or_not {
    public static void main(String[] args) {
        int[] array={1,3,6,9,10};
        System.out.println(sorted(array,0));
        
    }
    public static boolean sorted(int[] arr,int index){
        if(index==arr.length-1)
         return true;
        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }
    
}
