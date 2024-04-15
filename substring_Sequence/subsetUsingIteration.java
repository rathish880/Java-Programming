package substring_Sequence;

import java.util.ArrayList;
import java.util.List;

public class subsetUsingIteration {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(subset(arr));
        
    }
    public static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();

        outer.add(new ArrayList<>());
        for(int nums:arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
                ArrayList<Integer> inner=new ArrayList<>(outer.get(i));
                inner.add(nums);
                outer.add(inner);
            }
        }
        return outer;
    }
    
}
