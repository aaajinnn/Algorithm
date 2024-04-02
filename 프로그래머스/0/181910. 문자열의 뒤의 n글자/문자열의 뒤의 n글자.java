import java.util.Stack;
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
         char[] ch = my_string.toCharArray();
		//System.out.println(Arrays.toString(ch));
		
        //문자열의 뒤의 n글자를 push
		Stack<String> str = new Stack<>();
		for(int i = ch.length - 1; i >= ch.length - n && i >= 0; i--) {
			str.push(Character.toString(ch[i]));
		}

		//System.out.println(str);

		//n개를 pop하며 answer에 넣어줌
		while (!str.isEmpty()) {
		    answer += str.pop();
		}
        return answer;
    }
}