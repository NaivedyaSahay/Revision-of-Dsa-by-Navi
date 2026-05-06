class Solution {
    public String removeOuterParentheses(String s) {
        int counter=0;
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                if(counter>0){
                    sb.append(c);
                }
                counter++;
            }
            else{
                counter--;
                if(counter>0){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}