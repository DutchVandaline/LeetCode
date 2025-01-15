class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder answer = new StringBuilder();
        int index = 0;

        for(char c : word.toCharArray()){
            if(c == ch){
                answer.append(c);
                index++;
                answer = answer.reverse();
                break;
            } else{
                answer.append(c);
                index++;
            }
        }
        return answer.append(word.substring(index)).toString();
        
    }
}