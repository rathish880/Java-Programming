package LEETCODE_problems;

public class leetcode_1217 {
    public static void main(String[] args) {
        int[] position={2,2,2,3,3};
        System.out.println(minCostToMoveChips(position));
    }
    public static int minCostToMoveChips(int[] position) {
        int even=0,odd=0;
        for(int chip:position){
            if(chip%2==0)
                even++;
            else
                odd++;
        }
        if(even==position.length||odd==position.length)
            return 0;
        return Math.min(even,odd);
    }
}
