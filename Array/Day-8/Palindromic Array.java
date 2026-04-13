/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        for(int i=0;i<arr.length;i++){
            if(palindrome(arr[i])== false){
                return false;
            }
        }
        return true;
    }
    public static boolean palindrome(int n){
        int copy=n;//copy so number is not lost
        int rev=0; //reversed number 
        while(n!=0){//run untill numbr is not zero
            int dig=n%10;//to get the last digit
            rev=rev*10+dig;
            n=n/10;//remove the last digit
        }
        if(copy==rev) {
            return true;
        }
        else {
            return false;
        }
    }
}