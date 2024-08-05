public class leetcode_91_decode_ways {
    public static void main(String[] args){
        System.out.println(decodeUsingIndex("111111111111111111111111111111111111111111111",0));
    }

    //Solution sing Recursion
    
    public static int decode(String Original){
        if(Original.length()==0){
            return 1;
        }
        if(Original.charAt(0)=='0'){
            return 0;
        }
        int count=decode(Original.substring(1));
        if(Original.length()>=2 && (Original.charAt(0)=='1' ||(Original.charAt(0)=='2' && Original.charAt(1)<='6'))){
            count=count+decode(Original.substring(2));
        }
        return count;
    }

    public static int decodeUsingIndex(String Original,int index){
        if(index==Original.length()){
            return 1;
        }
        if(Original.charAt(index)=='0'){
            return 0;
        }
        int count=decodeUsingIndex(Original,index+1);
        if(index+1 < Original.length() && (Original.charAt(index)=='1' ||(Original.charAt(index)=='2' && Original.charAt(index+1)<='6'))){
            count=count+decodeUsingIndex(Original,index+2);
        }
        return count;
    }
}
