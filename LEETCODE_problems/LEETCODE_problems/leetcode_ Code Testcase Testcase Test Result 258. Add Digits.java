class Solution {
    int addDigits(int num) {
        //with O(1)  time complexity

        if(num<10){
            return num;
        }
        int a =num%9;
        return a==0?9:a;
    }
}
