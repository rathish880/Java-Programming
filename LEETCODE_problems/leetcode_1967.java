package LEETCODE_problems;

public class leetcode_1967 {
    public static void main(String[] args) {
        String[] patterns= {"a","abc","bc","d"};
        String word = "abc";
        System.out.println(numOfStrings(patterns,word) );
        
    }
    public static int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String p:patterns){
            if(word.indexOf(p)!=-1){
                count++;
            }
        }
        return count;
    }
    
}
