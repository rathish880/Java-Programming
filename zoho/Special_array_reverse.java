package zoho;



class Solution
{
    public String reverse(String str)
    {
        int n=str.length()-1;
        char[] arr=str.toCharArray();
        
        int i=0;
        int j=n;
        while(i<j){
            if(!Character.isLetter(arr[i])){
                i++;
            }
            if(!Character.isLetter(arr[j])){
                j--;
            }
            if(Character.isLetter(arr[i]) && Character.isLetter(arr[j])){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            
        }
       
        String res=new String(arr);
        return res;
    }
}