package LEETCODE_problems;

public class leetcode_1309 {
    public static void main(String[] args) {
        System.out.println(freqAlphabets("10#11#12"));
        System.out.println(freqAlphabets2("10#11#12"));
            
    }
    public static String freqAlphabets(String s) {
        StringBuilder str=new StringBuilder();
        int n=s.length();
        int i=n-1;
        while(i>=0){
            int num=0;
            if(s.charAt(i)!='#'){
                num=s.charAt(i)-'0';
                i=i-1;
            }

            else{
                num=(s.charAt(i-2)-'0')*10 + (s.charAt(i-1)-'0');
                i=i-3;
            }
            str.append((char)(num + 'a'-1));
        }
    
        return str.reverse().toString();
    }

    public static String freqAlphabets2(String s) {
        String res="";
        int n=s.length();
        for(int i=0;i<n;){
            if(i+2<n && s.charAt(i+2)=='#'){
                res+=(char)(Integer.valueOf(s.substring(i,i+2))+'a'-1);
                i=i+3;
            }
            else{
                res+=(char)((s.charAt(i)-'0')+'a'-1);
                i=i+1;
            }
        }
        return res;
    }
    
}
