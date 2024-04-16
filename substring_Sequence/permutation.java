package substring_Sequence;

import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        
     //permutReturn("","abc");
     System.out.println(permutReturn("","abc"));
     System.out.println(permutReturnCount("","abcdefgh"));
        
    }
    public  static void permut(String result, String Original){
        if(Original.isEmpty()){
            System.out.println(result);
            return;
        }
        char ch=Original.charAt(0);
        for(int i=0;i<=result.length();i++){
            String first=result.substring(0,i);
            String second=result.substring(i,result.length());
            permut(first + ch + second,Original.substring(1));
        }
        
    }

    public  static ArrayList<String> permutReturn(String result, String Original){
        if(Original.isEmpty()){
            //System.out.println(result);
            ArrayList<String> list=new ArrayList<>();
            list.add(result);

            return list;
        }
        ArrayList<String> ans=new ArrayList<>();


        char ch=Original.charAt(0);
        for(int i=0;i<=result.length();i++){
            String first=result.substring(0,i);
            String second=result.substring(i,result.length());
            ans.addAll(permutReturn(first + ch + second,Original.substring(1)));
        }
        return ans;
        
    }

    public  static int permutReturnCount(String result, String Original){
        if(Original.isEmpty()){
            //System.out.println(result);
            return 1;
        }
        ArrayList<String> ans=new ArrayList<>();

        int count=0;
        char ch=Original.charAt(0);
        for(int i=0;i<=result.length();i++){
            String first=result.substring(0,i);
            String second=result.substring(i,result.length());
            count=count + permutReturnCount(first + ch + second,Original.substring(1));
        }
        return count;
        
    }
    
}
