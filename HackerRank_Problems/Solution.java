package HackerRank_Problems;



class Result {

    /*
     * Complete the 'twoStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER maxSum
     *  2. INTEGER_ARRAY a
     *  3. INTEGER_ARRAY b
     */

    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
    // Write your code here
    // return twoStackSum(maxSum,a,b,0,0)-1;
    int sum = 0;
        int count = 0;
        int i = 0;
        int j = 0;
        
        // First take elements from stack a until the maxSum limit is reached
        while (i < a.size() && sum + a.get(i) <= maxSum) {
            sum += a.get(i);
            i++;
        }
        
        count = i;  // Initial count of elements taken from stack a
        
        // Try to take elements from stack b and adjust the elements from stack a
        while (j < b.size() && i >= 0) {
            sum += b.get(j);
            j++;
            
            // If the sum exceeds maxSum, remove elements from stack a
            while (sum > maxSum && i > 0) {
                i--;
                sum -= a.get(i);
            }
            
            // Update the maximum count of elements
            if (sum <= maxSum) {
                count = Math.max(count, i + j);
            }
        }
        
        return count;
    }
}



class Result{

    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {

        return twoStackSum(maxSum,a,b,0,0)-1;
        
    }

    public static int twoStackSum(int target,List<Integer> a,List<Integer> b,int sum,int count){
        if(sum>target){
            return count;
        }
        if(a.size()==0 ||b.size()==0){
            return count;
        }
       
        int s1=twoStackSum(target,a.subList(1,a.size()),b,sum+a.get(0),count+1);
        
        
        int s2=twoStackSum(target,a,b.subList(1,b.size()),sum+b.get(0),count+1);   
        
        
        return Math.max(s1,s2);
    }
}


    



