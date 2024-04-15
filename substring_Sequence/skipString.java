package substring_Sequence;

public class skipString {
    public static void main(String[] args) {
        System.out.println(skip("gadcdappleahbb"));
        
    }
    public static String skip(String Original){
        if(Original.isEmpty())
            return "";
        if(Original.startsWith("apple")){
            return skip(Original.substring(5));
        }
        else 
            return Original.charAt(0) + skip(Original.substring(1));
    }
    
}
