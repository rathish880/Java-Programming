package Patterns;

public class pattern_7 {
    public static void main(String[] args) {
        patterndemo(4);        
    }
    // public static void pattern(int n){
    //     for(int row=1;row<=n;row++){
    //         for(int spaces=0;spaces<=n-row;spaces++){
    //             System.out.print("  ");
    //         }
    //         for(int col=row;col>=1;col--){
    //             System.out.print(col+" ");
    //         }
    //         for(int col=2;col<=row;col++){
    //             System.out.print(col+ " ");
    //         }
    //         System.out.println();

    //     }
    // }






















    public static void patterndemo(int n){
        for(int row=1;row<=n;row++){
            int spaces=n-row+1;
            for(int i=1;i<spaces;i++){
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col);
            }
            for(int col=2;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

}
