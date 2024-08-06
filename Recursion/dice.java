package Recursion;

import java.util.ArrayList;

public class dice {
    public static void main(String[] args) {
        //System.out.println(dicethrowReturn("", 4));
        dicethrow("", 4);
       
        
    }
    public static void dicethrow(String result,int target){
        if(target==0){
            System.out.println(result);
            return;
        }
        for(int i=1;i<=6 &&i<=target;i++){
            dicethrow(result+i,target-i);
        }

    }

    public static ArrayList<String> dicethrowReturn(String result,int target){
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(result);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        for(int i=1;i<=6 &&i<=target;i++){
            ans.addAll(dicethrowReturn(result+i,target-i));
        }
        return ans;

    }
    
}
