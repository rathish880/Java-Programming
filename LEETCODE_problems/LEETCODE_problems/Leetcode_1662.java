package LEETCODE_problems;

public class Leetcode_1662 {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));
        
    }
   
        static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            String str1=String.join("",word1);
            String str2=String.join("",word2);
            // System.out.println(str1);
            //  System.out.println(str2);
    
            if(str1.equals(str2))
             return true;
            else return false;
            
        }
    
    
}
