package Recursion;

public class reverse_number {
    
    
    public static void main(String[] args) {

    reverse(897656798);
    System.out.println(sum);

    System.out.println(palindrone(897656798));
        
    }
    static int sum=0;
    public static void reverse(int n){
        if(n==0)
          return;
        int rem=n%10;
        sum=sum*10+rem;
        reverse(n/10);
    }
    public static boolean palindrone(int n){
        return n==sum;
    }

}
