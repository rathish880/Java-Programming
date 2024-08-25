import java.util.*;
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String str[]=paragraph.toLowerCase().split("[^a-z]+");
        Set<String> set=new HashSet<>(Arrays.asList(banned));
        HashMap<String,Integer> hash=new HashMap<>();
        for(String s:str){
            boolean flag=true;
            for(String b:banned){
                if(s.equals(b)){
                    flag=false;
                    break;  
                }
            }
            if(flag==true){
                hash.put(s,hash.getOrDefault(s,0)+1);
            } 
        }
        int max=0;
        String key="";
        for(String s:str){
            if(!set.contains(s) && hash.get(s)>=max){
                max=hash.get(s);
                key=s;
            }
        }
        return key;

    }
}
