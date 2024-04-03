package Patterns;

public class pattern_5 {

    public static void main(String[] args) {
        pattern(4);
       
        
    }
    public static void pattern(int n){
        for(int i=1;i<2*n;i++){
            
            int total=i>n? 2*n-i:i;
            int  spaces=n-total;
            for(int k=0;k<spaces;k++){
                System.out.print(" ");
            }
            for(int j=0;j<total;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
