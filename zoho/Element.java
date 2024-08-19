package zoho;
import java.util.*;

// Sort elements on the basis of number of factors.

// Given an array of positive integers. Sort the given array in decreasing order of number of factors of each element, i.e.,
// element having the highest number of factors should be the first to be displayed and the number having least number of factors
// should be the last one. Two elements with equal number of factors should be in the same order as in the original array.


public class Element {
    int index;
    int no_of_fact;

    Element(int n){

    }

    Element(int i,int no_of_fact){
        this.index=i;
        this.no_of_fact=no_of_fact;
    }

    public static int noOfFactors(int n){
        int sqrt=(int)Math.sqrt(n);
        int count=0;
        if(sqrt*sqrt==n){
            count++;
        }
        for(int i=1;i<Math.sqrt(n);i++){
            if(n%i==0){
                count+=2;
            }
        }
        return count;
    }

    public static void printOnBasisOfFactors(int[] arr,int n){
        Element demo[]=new Element[n];
        for(int i=0;i<demo.length;i++){
            demo[i]=new Element(i,noOfFactors(arr[i]));
        }

        Arrays.sort(demo,new Comparator<Element>(){
            @Override
            public int compare(Element e1,Element e2){
                if(e1.no_of_fact!=e2.no_of_fact){
                    return e1.no_of_fact>e2.no_of_fact?-1:1;
                }
                return e1.index<e2.index?-1:1;
            }
        });
        for(int i=0;i<demo.length;i++){
            System.out.print(arr[demo[i].index]+" ");
        }

    }
    
    public static void main(String[] args) {
        
        int[] arr={5, 11, 10, 20, 9, 16, 23};
        printOnBasisOfFactors(arr,arr.length);
    }

    
}
