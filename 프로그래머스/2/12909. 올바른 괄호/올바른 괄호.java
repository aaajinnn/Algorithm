import java.util.Stack;
class Solution {
  boolean solution(String s) {
 Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()) {
        	switch(ch) {
        	case '(' :
        		stack.push(ch);
        		break;
        	case ')' :
        		if(stack.isEmpty()) return false;
        		stack.pop();
        		break;
        	}
        }
        return stack.isEmpty();
    } 
}