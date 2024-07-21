package LEETCODE_problems;

public class Leetcode_709 {
    public static void main(String[] args) {
        System.out.println(toLowerCase("ZbuiwdAiAHi"));
        
    }
    static String toLowerCase(String s){
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int asciiVal=(int)ch;
            if(asciiVal >=65 && asciiVal<=90){
               int val=asciiVal+32;
               String str=Character.toString((char)val);
               result.append(str);
            }
            else{
                result.append(ch);
            }
        }
        return result.toString();
        }
    
}
