package LEETCODE_problems;

public class leetcode_1572 {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},
        {4,5,6},
        {7,8,9}};
        System.out.println(diagonalSum(mat));
        

    }
    public static int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
        int i,j,k;
        for(i=0;i<n;i++)
            sum=sum+mat[i][i];
        for(j=0,k=n-1;j<n;j++,k--)
            sum=sum+mat[j][k];
        if(n%2==0)
            return sum;
        return sum-mat[n/2][n/2];
    
    }
    
}
