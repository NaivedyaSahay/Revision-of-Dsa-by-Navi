class Solution {
    int missingNum(int arr[]) {
        // code here
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        long esum=((long)(arr.length+1)*(arr.length+2))/2;//make sure to take one long else it will overflow
        int res=(int)(esum-sum);
        return res;
    }
}