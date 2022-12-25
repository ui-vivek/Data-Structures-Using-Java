package Stack;

//---------------------------- Linked-List class.
class stack_LL<T> {
	T data;
	stack_LL<T> next;

	stack_LL(T data) {
		this.data = data;
	}
}

//------------------------------- Stack Classes.
class stack_cls_LL<T> {
	private stack_LL<T> head;
	private int size;

	stack_cls_LL() {
		head = null;
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
//		if(head==null) {
//			return true;
//		}else {
//			return false;
//		}

		return size == 0;
	}

	public void push(T element) {
		stack_LL<T> newHead = new stack_LL<T>(element);
		newHead.next = head;
		head = newHead;
		size++;
	}

	public T top() {
		return head.data;
	}

	public T pop() throws StackEmptyExpception {
		if (head == null) {
			throw new StackEmptyExpception();
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
}

public class Stack_Using_LL {

	public static void main(String[] args) throws StackEmptyExpception, StackFullExpception {

		stack_cls_LL<Integer> stk = new stack_cls_LL<>();
//		System.out.println(stk.size());
//		System.out.println(stk.isEmpty());
//		stk.push(50);
//		System.out.println(stk.size());

		int arr[] = { 40, 50, 60, 70, 80, 90, 100 };
		for (int i = 0; i < arr.length; i++) {
			stk.push(arr[i]);
		}
		System.out.println("Size of Stack is : " + stk.size());

		while (!stk.isEmpty()) {
			System.out.println(stk.pop());
		}
		System.out.println("Size of Stack is : " + stk.size());
	}

}
