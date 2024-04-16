package LEETCODE_problems;

public class leetcode_1678 {
    public static void main(String[] args) {
        System.out.println(interpret("(al)G(al)()()G"));
        
    }
        public static String interpret(String command) {
            String res="";
            char[] str=command.toCharArray();
            for(int i=0;i<str.length;i++){
                if(str[i]=='G')
                 res=res+str[i];
                else if(str[i]=='(' && str[i+1]==')'){
                    res=res+'o';
                    i=i+1;
                }
                 
                else if(str[i]=='(' && str[i+1]=='a'){
                    res=res+"al";
                    i=i+2;
                }

            }
           return res;
        }
    }
    

