package Patterns;

public class pattern_4 {
    public static void main(String[] args) {
      //  pattern(5);
       patterndemoUser(5); 
    }
    // public static void pattern(int n){
    //     for(int i=0;i<2*n;i++){
    //         if(i>n){
    //             for(int j=2*n-1;j>=i;j--){
    //                 System.out.print("* ");
    //             }
    //             System.out.println();
    //         }
    //         else{
    //             for(int j=0;j<i;j++){
    //                 System.out.print("* ");
    //             }
    //             System.out.println();
    //         }
    //     }

    // }
    























    // public static void patterndemo(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*"+" ");
    //         }
    //         System.out.println();
    //     }
    //     for(int i=1;i<n;i++){
    //         for(int j=1;j<n-i+1;j++){
    //             System.out.print("*"+" ");
    //         }
    //         System.out.println();
    //     }
    // }
    public static void patterndemoUser(int n){
        for(int i=1;i<=2*n-1;i++){
            if(i<=n){
                for(int j=1;j<=i;j++){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
            else{
                for(int j=1;j<2*n-i+1;j++){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
            

        }
    }
}
