package zoho;

public class Index_of_an_Extra_Element {
    public static void main(String[] args) {
        int[] arr1={2,4,6,8,9,10,12}; 
        int arr2[] = {2,4,6,8,10,12};
        System.out.println(findExtra(7,arr1,arr2));
    }
    public static int findExtra(int n, int arr1[], int arr2[]) {
        int start=0;
        int end=n-1;
        int index=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr1[mid]==arr2[mid]){
                start=mid+1;
            }
            else{
                index=mid;
                end=mid-1;
            }
        }
        return index;
    }
}
