class Solution {
    public ArrayList<Integer> commonElements(int[] arr1, int[] arr2, int[] arr3) {
        // code here
        HashSet<Integer> s1=new HashSet<>();
        HashSet<Integer> s2= new HashSet<>();
        HashSet<Integer> result= new HashSet<>();
        
        ArrayList<Integer> res =new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            s1.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            s2.add(arr2[i]);
        }
        for(int i=0;i<arr3.length;i++){
            if((s1.contains(arr3[i])) && (s2.contains(arr3[i])))result.add(arr3[i]);
        }
        for(int i:result){
            res.add(i);
        }
        Collections.sort(res);
        return res;
    }
}