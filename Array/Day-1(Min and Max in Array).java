import java.util.*;
class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int g=arr[0];
        int s=arr[0];
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=1;i<arr.length;i++ ){
            if(arr[i]<s){
                s=arr[i];
            }
            if(arr[i]>g){
                g=arr[i];
            }
        }
        res.add(s);
        res.add(g);
        return res;
    }
}
