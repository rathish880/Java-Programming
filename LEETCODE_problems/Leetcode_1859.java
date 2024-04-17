package LEETCODE_problems;

public class Leetcode_1859 {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3")); 
    }
    
        public static String sortSentence(String s) {
            String[] str=s.split(" ");
            for(int i=0;i<str.length;i++){
                for(int j=0;j<str.length-1;j++){
                    int first=str[j].charAt(str[j].length()-1);
                    int second=str[j+1].charAt(str[j+1].length()-1);
                    if(first>second){
                        String temp=str[j];
                        str[j]=str[j+1];
                        str[j+1]=temp;
                    }
                }

            }
            for(int i=0;i<str.length;i++){
                str[i]=str[i].substring(0,str[i].length()-1);
            }
            String str1=String.join(" ",str);
            return str1;
        }
    
    
}
