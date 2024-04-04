package Patterns;
import java.util.*;

public class pattern_9 {
    public static void main(String[] args) {
        pattern(6);
        
    }
    public static void pattern(int n){
        int originalIndex=n;
        n=2*n;
        for(int row=1;row<n;row++){
            for(int col=1;col<n;col++){
                int left=col;
                int right=n-col;
                int up=row;
                int down=n-row;

                System.out.print(originalIndex-Math.min(Math.min(left,right),Math.min(up,down))+1 +" ");
            }
            System.out.println();
        }
    }
    
}
