package Stack;

import java.util.Stack;

public class Stack_Using_JAVA_Stack {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<Integer>();

		stk.push(5);
		stk.push(10);
		stk.push(15);
		System.out.print(stk.pop() + stk.size());

		while (!stk.isEmpty()) {
			System.out.print(stk.pop());
		}
	}

}
