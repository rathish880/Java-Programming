package Patterns;
    
import java.util.*;
public class magicMatrix {
    public static void main(String[] args) {
        List<List<Integer>> s=new ArrayList<>(0);
        for(int i=0;i<3;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<3;j++){
                row.add(0);
            }
            s.add(row);
        }
        formingMagicSquare(s);
    }
    public static void formingMagicSquare(List<List<Integer>> s) {
    // Write your code here
        //List<List<Integer>> arr=new ArrayList<>(s.size());


    // Rule 1: At any position, the position of the next number is computed by decreasing the row number of the previously filled number by 1
    //         and increasing the column number of the previously filled number by 1. 
    //         At any point of time, if the calculated position of the row becomes -1, then we will wrap it around to m - 1. 
    //         Similarly, if the calculated position of the column becomes m, then we will wrap it around to 0.

    // Rule 2: If at the computed position, a number is already present in the magic square, then the computed position of the column 
    //         is decreased by 2, and the computed position of the row is increased by 1.

    // Rule 3: If the computed position of the row is -1 & the computed position of the column is m, then the new position will be: (0, m - 2).
        int m=s.size();
        int r=m/2;
        int c=m-1;
        for(int i=1;i<=m*m;){
            //3rd condition
            if(r==-1 && c==m){
                r=0;
                c=m-2;
            }
            //1st condition
            else{
                if(r==-1){
                    r=m-1;
                }
                else if(c==m){
                    c=0;
                }
            }
            //2nd condition
            if(s.get(r).get(c)!=0){
                r=r+1;
                c=c-2;
                continue;
            }
            else{
                s.get(r).set(c,i);
                i=i+1;
            }
            //1st condition
            r=r-1;
            c=c+1;
        }
        for(int j=0;j<s.size();j++){
            for(int k=0;k<s.get(0).size();k++){
                System.out.print(s.get(j).get(k)+" ");
            }
            System.out.println();
        }
    }
}



