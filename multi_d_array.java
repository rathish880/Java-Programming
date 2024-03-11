import java.util.*;

public class multi_d_array {

    public static void main(String args[]){
        Scanner in =new Scanner(System.in);

        int[][] arr=new int[3][3];
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=in.nextInt();
                System.out.println(arr[i][j]);
            }
        }
        
    }

    
}
