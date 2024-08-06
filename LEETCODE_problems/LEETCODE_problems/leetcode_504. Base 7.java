
class Solution {
    public String convertToBase7(int num) {
        if(num==0){
            return "0";
        }

        String str="";

        Boolean isNegative=num<0;
        num=Math.abs(num);
        while(num>0){
            int rem=num%7;
            str=rem+str;
            num=num/7;
        }
        if(isNegative){
            return "-"+str;
        }
        return str;

    }
}