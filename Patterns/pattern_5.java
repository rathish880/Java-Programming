package Patterns;

public class pattern_5 {

    public static void main(String[] args) {
        patterndemo(4);
       
        
    }
    // public static void pattern(int n){
    //     for(int i=1;i<2*n;i++){
            
    //         int total=i>n? 2*n-i:i;
    //         int  spaces=n-total;
    //         for(int k=0;k<spaces;k++){
    //             System.out.print(" ");
    //         }
    //         for(int j=0;j<total;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

























    public static void patterndemo(int n){
        for(int i=1;i<2*n;i++){
            
            if(i<=n){
                int spaces=n-i;
                for(int k=1;k<=spaces;k++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                int spaces=2*n-i;
                for(int k=1;k<=n-spaces;k++){
                    System.out.print(" ");
                }
                for(int j=1;j<2*n-i+1;j++){
                    System.out.print("* ");
                }
                System.out.println();

            }
        }
    }
    
}
