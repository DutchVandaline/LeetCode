class Solution {
    public String removeDuplicates(String s) {
        StringBuilder answer = new StringBuilder();

        answer.append(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            if(answer.length() == 0) {
                answer.append(s.charAt(i));
                continue;
            }
            
            if(s.charAt(i) == answer.charAt(answer.length()-1)){
                answer.deleteCharAt(answer.length()-1);
            }else{
                answer.append(s.charAt(i));
            }
        }
        return answer.toString();
    }
}