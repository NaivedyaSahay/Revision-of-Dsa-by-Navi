import java.util.*;
class Solution {
    public double medianOf2(int a[], int b[]) {
        // Code Here
        int arr[]=new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            arr[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            arr[i+a.length]=b[i];
        }        
        Arrays.sort(arr);
        //if length is odd simple return the middle element
        int n=arr.length;
        int index=n/2;
        if(n%2==0){
            int el1=(n/2)-1;
            int el2=(n/2);
            return (double)(arr[el1]+arr[el2])/2;
        }
        else{
            return arr[index];
        }
    }
}