import java.util.Stack;
class Solution {
    public int solution(int[] ingredient) {
        		int answer = 0;
		Stack<Integer> ham = new Stack<>();
		ham.push(1);
		ham.push(2);
		ham.push(3);
		ham.push(1);
		
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<ingredient.length; i++) {
			stack.push(ingredient[i]);
			if(stack.size() >= ham.size()) {
				boolean found = true;
				for(int j=0; j<ham.size(); j++) {
					if(stack.get(stack.size() - ham.size() + j) != ham.get(j)) {
						found = false;
						break;
					}
				}
				if(found) {
					answer++;
					for(int j=0; j<ham.size(); j++) {
						stack.pop();
					}
				}
			}
		}
		return answer;
    }
}