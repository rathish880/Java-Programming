package LEETCODE_problems;

class Solution {
    public int minInsertions(String s) {
    int leftCount=0;
    int insertions=0;
    int i=0;
    while(i<s.length()){
        if(s.charAt(i)=='('){
            leftCount++;
            i++;
        }
        else{
            if(i+1<s.length() && s.charAt(i+1)==')'){
                if(leftCount>0){
                    leftCount--;
                }
                else{
                    insertions++;
                }
                i=i+2;
            }
            else{
                if(leftCount>0){
                    leftCount--;
                    insertions++;
                }
                else{
                    insertions+=2;
                }
                i+=1;
            }
        }
    }
    insertions=insertions+leftCount*2;
    return insertions;
    }
}