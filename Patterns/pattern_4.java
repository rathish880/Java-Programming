package Patterns;

public class pattern_4 {
    public static void main(String[] args) {
        pattern(5);
        
    }
    public static void pattern(int n){
        for(int i=0;i<2*n;i++){
            if(i>n){
                for(int j=2*n-1;j>=i;j--){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for(int j=0;j<i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

    }
    
}
