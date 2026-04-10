import java.util.*;
class Solution {
    public double findMedian(int[] arr) {
        // Code here.
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
