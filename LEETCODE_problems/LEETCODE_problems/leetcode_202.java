package LEETCODE_problems;
class leetcode_202{
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        
    }
    public static boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        while(fast!=1){
            slow=prod(slow);
            fast=prod(prod(fast));
            if(fast==1){
                return true;
            }
        }
        return false;
    }
    public static int prod(int n){
        int product=0;
        while(n>0){
            product=product+(n%10)*(n%10);
            n=n/10;
        }
        return product;
    }
}