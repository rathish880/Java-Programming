package LEETCODE_problems;

public class leetcode_657 {
    public static void main(String[] args) {
        
        System.out.println(judgeCircle("LRUD"));
    }

    public static boolean judgeCircle(String moves){
        int[] res=new int[128];
        for(char ch:moves.toCharArray()){
            res[ch]++;
        }    
        if(res['U']==res['D'] && res['R']==res['L'])
            return true;
        return false;
    }
    
}
