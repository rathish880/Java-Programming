
import java.util.*;
class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
	    for(int i=0;i<nums.length;i++){
	        if(map.containsKey(nums[i])){
	            map.put(nums[i],map.get(nums[i])+1);
	        }
	        else{
	            map.put(nums[i],1);
	        }
	        
	    }
	    List<int[]> num=new ArrayList<>();
	    for(Map.Entry<Integer,Integer> entryset:map.entrySet()){
	        num.add(new int[]{entryset.getKey(),entryset.getValue()});
	    }
	    Collections.sort(num,new Comparator<int[]>(){
	        @Override
	        public int compare(int[] a,int[] b){
	            if(a[1]!=b[1]){
	                return a[1]-b[1];
	            }
	            else{
	                return b[0]-a[0];
	            }
	        }
	    });
	    int index=0;
	    for(int[] pair:num){
	        int value=pair[0];
	        int freq=pair[1];
	        for(int i=0;i<freq;i++){
	            nums[index++]=value;
	        }
	    }
       return nums;
    }
}