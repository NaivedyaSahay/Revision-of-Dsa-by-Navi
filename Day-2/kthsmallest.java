import java.util.*;
class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        //time complexity n(logn)
        // Arrays.sort(arr);
        // return arr[k-1];
        PriorityQueue<Integer> heapmax=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){//time complexity n(logk)
            heapmax.add(arr[i]);
            if(heapmax.size()>k){
                heapmax.poll();
            }
        }
        return heapmax.peek();
    }
}