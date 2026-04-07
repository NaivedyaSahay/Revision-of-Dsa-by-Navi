// User function Template for Java

class Solution {

    public void Rearrange(int arr[], int no) {
        // Your code goes here
        
        //EXTRA SPACE AND TIME COMPLEXITY IS N
        ArrayList<Integer> p=new ArrayList<>();
        ArrayList<Integer> n=new ArrayList<>();
        for(int i=0;i<no;i++){
            if(arr[i]>=0)p.add(arr[i]);
            else n.add(arr[i]);
        }
        n.addAll(p);
        for(int i=0;i<no;i++){
           arr[i]=n.get(i);
        }
    }
}