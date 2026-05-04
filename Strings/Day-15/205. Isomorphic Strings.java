class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hms = new HashMap<>();
        HashMap<Character,Character> hmt = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(!hms.containsKey(s.charAt(i))){//if not exist no problem just put it in the map
                hms.put(s.charAt(i),t.charAt(i));
            }
            else{//if exist then we have to check whether the value is pointing to the current el or not
                if(!(hms.get(s.charAt(i))==t.charAt(i)))return false;
            }
            if(!hmt.containsKey(t.charAt(i))){
                hmt.put(t.charAt(i),s.charAt(i));
            }       
            else{
                if(!(hmt.get(t.charAt(i))==s.charAt(i)))return false;
            }     
        }
        return true;
    }
}