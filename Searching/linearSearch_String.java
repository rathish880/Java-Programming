package Searching;

public class linearSearch_String {
    public static void main(String[] args) {
        String str="rathish";
        char target='t';
        System.out.println(Search(str,target));
    }
    public static Boolean Search(String tt,char pp){
        if(tt.length()==0)
          return false;
        for(int i=0;i<tt.length();i++){
            if(pp==tt.charAt(i))
             return true;
              
        }
        return false;
    }
}
