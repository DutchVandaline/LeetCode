import java.util.ArrayList;

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder answer = new StringBuilder();
        int depth = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                if (depth > 0) {
                    answer.append(ch);  // 외부 괄호가 아닌 경우에만 추가
                }
                depth++;  // 중첩 깊이 증가
            } else if (ch == ')') {
                depth--;  // 중첩 깊이 감소
                if (depth > 0) {
                    answer.append(ch);  // 외부 괄호가 아닌 경우에만 추가
                }
            }
        }

        return answer.toString();
    }
}
