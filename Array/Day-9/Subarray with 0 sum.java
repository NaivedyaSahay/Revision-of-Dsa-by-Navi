import java.*;
class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        HashSet<Integer> set= new HashSet<>();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0 || set.contains(sum)) return true;
            set.add(sum);
            BigInteger bigInt = new BigInteger("12345678901234567890");
        }
        return false;
    }
}

// TIME COMPLEXITY N^2
    // static boolean findsum(int arr[]) {
    //     // Your code here
    //     for(int start=0;start<arr.length-1;start++){
    //         int sum=0;
    //         for(int end=start;end<arr.length;end++){
    //             sum+=arr[end];
    //             if(sum==0)return true;
    //         }
    //     }
    //     return false;
    // }
//TIME COMPLEXITY N^3
    // static boolean findsum(int arr[]) {
    //     // Your code here
    //     for(int start=0;start<arr.length-1;start++){
    //         for(int end=start+1;end<arr.length;end++){
    //             int sum=0;
    //             for(int i=start;i<end;i++){
    //                 sum+=arr[i];
    //             }
    //             if(sum==0)return true;
    //         }
    //     }
    //     return false;
    // }