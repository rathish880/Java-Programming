
import java.util.Stack;
public class leetcode_394_decode_String {
    public static void main(String[] args) {
        String str="3[a2[c]]";
        System.out.println(decodeString(str));
    }
    
    public static String decodeString(String s) {
        String result="";
        String temp="";
        Stack<Character>StringStack =new Stack<>();
        Stack<Integer> IntegerStack=new Stack<>();
        for(int i=0;i<s.length();i++){
            int count=0;
            if(Character.isDigit(s.charAt(i))){
                while(Character.isDigit(s.charAt(i))){
                    count=count*10+s.charAt(i)-'0';
                    i++;
                }
                i--;
                IntegerStack.push(count);
            }
            else if(s.charAt(i)==']'){
                temp="";
                
                if(!IntegerStack.isEmpty()){
                    count=IntegerStack.peek();
                    IntegerStack.pop();
                }
                while(!StringStack.isEmpty() && StringStack.peek()!='['){
                    temp=StringStack.peek() +temp;
                    StringStack.pop();
                }
                if(!StringStack.isEmpty() && StringStack.peek()=='['){
                    StringStack.pop();
                }
                for(int j=0;j<count;j++){
                    result=result+temp;
                }
                for(int j=0;j<result.length();j++){
                    StringStack.push(result.charAt(j));
                }
                result="";
            }
            else if(s.charAt(i)=='['){
                if(Character.isDigit(s.charAt(i-1))){
                    StringStack.push(s.charAt(i));
                } 
                else{
                    StringStack.push(s.charAt(i));
                    IntegerStack.push(1);
                }
            }
            else{
                StringStack.push(s.charAt(i));
            }

        }
        while(!StringStack.isEmpty()){
            result=StringStack.peek()+result;
            StringStack.pop();

        }
        return result;
    }
}
