package Recursion;

public class pattern1 {
    public static void main(String[] args) {
        pattern(5,0);
        
    }
    public static void pattern(int column,int n){
        if(column==0)
         return;
        if(n<column){
            System.out.print("* ");
            pattern(column,n+1);
        }else{
            System.out.println("\n");
            pattern(column-1,0);
        }
    }
    
}
