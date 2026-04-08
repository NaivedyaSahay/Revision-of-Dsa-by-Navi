import java.util.ArrayList;
import java.util.HashMap;
class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        
        //USING EXTRA SPACE TIME COMPLEXITY N
        
        ArrayList<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<a.length;i++){
            hm.put(a[i],1);
        }
        for(int i=0;i<b.length;i++){
            hm.put(b[i],1);
        }
        hm.forEach((k,v)->res.add(k));//hashmap name.foreach((k,v)-> what to do
        return res;
    }
}