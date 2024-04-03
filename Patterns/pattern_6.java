package Patterns;

public class pattern_6 {
    public static void main(String[] args) {
        pattern(4);        
    }   
    public static void pattern(int n){
        for(int i=0;i<2*n;i++){
            
            if(i<n){
                int total=n-i;
                int spaces=n-total;
                for(int j=0;j<spaces;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<total;j++){
                    System.out.print("* ");
                }
                System.out.println();

            }
            else{
                int total=i-n+1;
                int spaces=n-total;
                for(int j=0;j<spaces;j++){
                    System.out.print(" ");
                }
                for(int k=0;k<total;k++){
                    System.out.print("* ");
                }
                System.out.println();
            }
           
        }

    } 
}
