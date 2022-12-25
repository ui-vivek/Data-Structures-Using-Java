package Stack;

import java.util.Stack;

public class Check_redundant_brackets {

	public static void main(String[] args) {

		Stack<Character> stk = new Stack<Character>();
		String expression = "(a+b*((a/c-d)))";
		boolean isTrue = true;
		for (int i = 0; i < expression.length(); i++) {

			if (expression.charAt(i) == ')') {
				if (stk.peek() == '(') {
					isTrue = true;
					break;
				}
				while (stk.peek() != '(') {
					if (stk.peek() == '+' || stk.peek() == '-' || stk.peek() == '*' || stk.peek() == '/') {
						isTrue = false;
					}
					System.out.println(stk.pop());
				}
				System.out.println(stk.pop());
			} else {
				stk.push(expression.charAt(i));
			}

		}
		System.out.println(isTrue);

		System.out.println("is emoty : = " + stk.isEmpty());
	}
}
