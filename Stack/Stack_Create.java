package Stack;

class stack {
	private int data[];
	private int index;

	stack() { // default size is 10
		data = new int[10];
		index = -1;
	}

	stack(int size) { // User can create the size as want .
		data = new int[size];
		index = -1;
	}

	public void push(int element) throws StackFullExpception {
		if (index == data.length - 1) {
			throw new StackFullExpception();
		}

		data[++index] = element;
	}

	public int size() {

		return index + 1;
	}

	public int pop() throws StackEmptyExpception {
		if (index == -1) {
			throw new StackEmptyExpception();
		}
		int temp = data[index];
		index--;
		return temp;
	}

	public boolean isEmpty() {
		if (index == -1) {
			return true;
		} else {
			return false;
		}

		// return index == -1; // work same as the if-else.
	}

	public int top() throws StackEmptyExpception {
		return data[index];
	}
}

class StackEmptyExpception extends Exception { // For exception handling
}

class StackFullExpception extends Exception { // For exception handling
}

public class Stack_Create {

	public static void main(String[] args) throws StackEmptyExpception, StackFullExpception {

		// stack stk = new stack(); // Default
		stack stk = new stack(100);
		int arr[] = { 11, 12, 13, 14, 15, 16 };
		for (int i = 0; i < arr.length; i++) {
			stk.push(arr[i]);
		}
		System.out.println("Size of Stack is : " + stk.size());
		System.out.println(stk.isEmpty());
		while (!stk.isEmpty()) {
			System.out.println(stk.pop());
		}
		System.out.println("Size of Stack is : " + stk.size());
		System.out.println(stk.isEmpty());

	}

}
