package LEETCODE_problems;

public class leetcode_1342 {
    public static void main(String[] args) {
     System.out.println(step(14));
        
    }
        // public int numberOfSteps(int num) {
        //     return step(num);
            
        // }
    
    public static int step(int n){
        return helper(n,0);
    }
    public static int helper(int n,int count){
        if(n==0)
        return count;
        if(n%2==0){
            return helper(n/2,count+1);
        }
        else{
            return helper(n-1,count+1);
        }
    }
}
    