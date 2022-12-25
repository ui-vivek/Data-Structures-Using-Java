package Stack;

import java.util.Stack;

public class Minimum_bracket_Reversal {

	public static void main(String[] args) {
//	             }}}{{{
		Stack<Character> stk = new Stack<>();
		String input = "}}}{{{";
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '{') {
				stk.push(input.charAt(i));
			} else if (input.charAt(i) == '}' && stk.isEmpty()) {
				stk.push(input.charAt(i));
			} else if (input.charAt(i) == '}' && stk.peek() == '{') {
				stk.pop();
			} else if (input.charAt(i) == '}' && !stk.isEmpty()) {

				if (stk.peek() == input.charAt(i)) {
					count++;
					stk.pop();
				} else {
					count = count + 2;
				}

			}

		}
		while (!stk.isEmpty()) {
			Character c1 = stk.pop();
			if (!stk.isEmpty()) {
				Character c2 = stk.pop();
				if (c1 == c2) {
					count++;
				} else {
					count = count + 2;
				}
			} else {
				System.out.println(-1);
				break;
			}
		}
		System.out.println(count);

	}

}
