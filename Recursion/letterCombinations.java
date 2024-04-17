package Recursion;

import java.util.ArrayList;

public class letterCombinations {
    public static void main(String[] args) {
       // letterReturn("","12");
        System.out.println(letterReturnCount("","12"));
        
    }
    public static void letter(String result,String Original){
        if(Original.isEmpty()){
            System.out.println(result);
            return;
        }
        int index=Original.charAt(0)-'0';
        for(int i=(index-1)*3;i<index*3;i++){
            char ch=(char) ('a'+i);
            letter(result+ch,Original.substring(1));

        }
    }
    public static ArrayList<String> letterReturn(String result,String Original){
        if(Original.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(result);
            
            return list;
        }
        int index=Original.charAt(0)-'0';
        ArrayList<String> ans= new ArrayList<>();
        for(int i=(index-1)*3;i<index*3;i++){
            char ch=(char) ('a'+i);
            ans.addAll(letterReturn(result+ch,Original.substring(1)));

        }
        return ans;
    }

    public static int letterReturnCount(String result,String Original){
        if(Original.isEmpty()){
            //ArrayList<String> list=new ArrayList<>();
           // list.add(result);
            
            return 1;
        }
        int count=0;
        int index=Original.charAt(0)-'0';
       // ArrayList<String> ans= new ArrayList<>();
        for(int i=(index-1)*3;i<index*3;i++){
            char ch=(char) ('a'+i);
            count =count + letterReturnCount(result+ch,Original.substring(1));

        }
        return count;
    }
}
