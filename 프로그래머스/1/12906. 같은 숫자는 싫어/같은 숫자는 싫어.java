import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        		int[] answer = null;
		Stack<Integer> list = new Stack<>();
		for (int i : arr) {
			if (list.isEmpty()) {
				list.push(i);
			} else if (list.peek() != i) {
				list.push(i);
			}
		}
		// System.out.println(list);

		answer = new int[list.size()];
		for (int i = list.size() - 1; i >= 0; i--) {
			answer[i] = list.pop();
		}
		// System.out.println(Arrays.toString(answer));
		return answer;
    }
}