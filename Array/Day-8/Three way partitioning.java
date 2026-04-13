import java.util.*;
public class Solution {
    // Function to partition the array around the range such
    // that array is divided into three parts.
    public void threeWayPartition(int arr[], int a, int b) {
        // code here
        ArrayList<Integer> small=new ArrayList<>();
        ArrayList<Integer> mid=new ArrayList<>();
        ArrayList<Integer> big=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int n=arr[i];
            if(n<a)small.add(n);
            else if(n>b)big.add(n);
            else mid.add(n);
        }
        for(int i=0;i<small.size();i++){
            arr[i]=small.get(i);
        }
        for(int i=0;i<mid.size();i++){
            arr[i+small.size()]=mid.get(i);
        }
        for(int i=0;i<big.size();i++){
            arr[i+small.size()+mid.size()]=big.get(i);
        }
    }
}
