class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm= new HashMap<>();
        //putting elements in the hashmap
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }
            else{
                hm.put(c,1);
            }
        }
        //putting hashmap keys into lists
        List<Character> l =new ArrayList<>(hm.keySet());
        //sorting the list keys into descending order according to values
        Collections.sort(l,(a,b)->hm.get(b)-hm.get(a));

        StringBuilder sb = new StringBuilder();
        //making new StringBuilder to return result
        for(int i=0;i<l.size();i++){
            char c=l.get(i);
            int freq=hm.get(l.get(i));
            for(int j=0;j<freq;j++){
                sb.append(c);
            }
        }
        return sb.toString();
        


    }
}