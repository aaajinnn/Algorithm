import java.util.*;

class Solution
{
     public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop(); // 짝이 맞으면 스택에서 제거
            } else {
                stack.push(c); // 짝이 맞지 않으면 스택에 추가
            }
        }
        
        return stack.isEmpty() ? 1 : 0; // 스택이 비어 있으면 1, 그렇지 않으면 0
    }
}