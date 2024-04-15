package substring_Sequence;

import java.util.ArrayList;
import java.util.Arrays;

public class subset {
    public static void main(String[] args) {
        //ArrayList<String> list=subSetReturn("","abcd");
        System.out.println(subSetReturn1("","abc"));
        // char ch='a';
        // System.out.println(ch+0);
        
    }
    public static void subSet(String result,String Original){
        if(Original.isEmpty()){
            System.out.println(result);
            return;    
        }

        char ch=Original.charAt(0);
        subSet(ch+result,Original.substring(1));
        subSet(result,Original.substring(1));
        
    }

    public static ArrayList<String> subSetReturn(String result,String Original){
        if(Original.isEmpty()){
            
            ArrayList<String> list=new ArrayList<>();
            list.add(result);
            return list;    
        }

        char ch=Original.charAt(0);
        ArrayList<String> left=subSetReturn(ch+result,Original.substring(1));
        ArrayList<String> right=subSetReturn(result,Original.substring(1));
        left.addAll(right);
        return left;

        
    }

    public static ArrayList<String> subSetReturn1(String result,String Original){
        if(Original.isEmpty()){
            
            ArrayList<String> list=new ArrayList<>();
            list.add(result);
            return list;    
        }

        char ch=Original.charAt(0);
        ArrayList<String> left=subSetReturn(ch+result,Original.substring(1));
        ArrayList<String> right=subSetReturn(result,Original.substring(1));
        ArrayList<String> ascii=subSetReturn(result + (ch + 0),Original.substring(1));
        left.addAll(right);
        left.addAll(ascii); 
        return left;

        
    }
    
}
