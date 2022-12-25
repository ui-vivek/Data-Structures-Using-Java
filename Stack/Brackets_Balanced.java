package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Brackets_Balanced {

	public static void main(String[] args) {

		Stack<Character> stack = new <Character>Stack();
		Scanner s = new Scanner(System.in);
//		String expression = s.next(); (())[[{()}]]
		String expression = "(())[[{()}]]";

		for (int i = 0; i < expression.length(); i++) {
			if (expression.charAt(0) == ')' || expression.charAt(0) == '}' || expression.charAt(0) == ']') {
				stack.push(expression.charAt(i));
				break;
			}
			if (expression.charAt(i) == '(' || expression.charAt(i) == '{' || expression.charAt(i) == '[') {
				stack.push(expression.charAt(i));
			} else {
				if (expression.charAt(i) == ')') {
					if (stack.peek() == '(') {
						stack.pop();
					} else {
						break;
					}
				} else if (expression.charAt(i) == '}') {
					if (stack.peek() == '{') {
						stack.pop();
					} else {
						break;
					}
				} else if (expression.charAt(i) == ']') {
					if (stack.peek() == '[') {
						stack.pop();
					} else {
						break;
					}
				}
			}

		}
		System.out.println(stack.isEmpty());

	}
}
