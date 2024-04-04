package Patterns;

public class pattern_8 {
    public static void main(String[] args) {
        pattern(4);
        
    }
    public static void pattern(int n){
        for(int row=1;row<=2*n;row++){
            if(row>n){
                int total=2*n-row;
                int spaces=2*n-total;
                for(int j=0;j<spaces;j++){
                    System.out.print(" ");
                }
                for(int col=total;col>=1;col--){
                    System.out.print(col+" ");
                }
                for(int col=2;col<=total;col++){
                    System.out.print(col+" ");
                }
                System.out.println();
            }
            else{
                for(int spaces=0;spaces<=n-row;spaces++){
                    System.out.print("  ");
                }
                for(int col=row;col>=1;col--){
                    System.out.print(col+" ");
                }
                for(int col=2;col<=row;col++){
                    System.out.print(col+ " ");
                }
                System.out.println();
            }
        }

    }
    
}
