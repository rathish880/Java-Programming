package substring_Sequence;

public class skip {
    public static void main(String[] args) {
        skip("","baccabagehwa");
    }
    public static void skip(String result,String original){
        if(original.isEmpty()){
            System.out.println(result);
            return;
        }
        char ch=original.charAt(0);
        if(ch=='a'){
            skip(result,original.substring(1));
        }
        else{
            skip(result+ch,original.substring(1));
        }
    }
    
}
