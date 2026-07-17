//brute force n^2
// class Solution {
//     public int findDuplicate(int[] nums) {
//      for(int i=0;i<nums.length;i++){
//         int currnum=nums[i];
//         for(int j=i+1;j<nums.length;j++){
//             if(currnum==nums[j]) return currnum;
//         }
//      }
//      return 0 ;
//     }
// }

//-----------------------------------------

// sorting nlogn [In searching always think about sorting]
// class Solution {
//     public int findDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length-1;i++){
//            if(nums[i]==nums[i+1]) return nums[i];
//         }
//         return 0;
//     }
// }

//-----------------------------------------

// time eff solution but takes space using hashset O(n) and O(n) space

// class Solution {
//     public int findDuplicate(int[] nums) {
//       HashSet<Integer> hs = new HashSet<>();
//       for(int i=0;i<nums.length;i++){
//         if(hs.contains(nums[i])) return nums[i];
//         hs.add(nums[i]);
//       }
//       return 0;
//     }
// }

//-----------------------------------------

class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0,fast=0;
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);

        slow=0;
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}