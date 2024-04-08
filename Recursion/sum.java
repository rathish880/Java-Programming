package Recursion;

public class sum {
    public static void main(String[] args) {
        System.out.println(sum1(10));
        
    }
    public static int sum1(int n){
        if(n<=0){
            return 0;
        }
        return n+sum1(n-1);
    }
}
