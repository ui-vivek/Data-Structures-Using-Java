package Queues;

import java.util.LinkedList;
import java.util.Queue;

class stk_usnig_que {
	Queue<Integer> q1;
	Queue<Integer> q2;

	stk_usnig_que() {
		q1 = new LinkedList<>();
		q2 = new LinkedList<>();
	}

	boolean isEmpty() {
		if (q1.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	int size() {

		return q1.size();
	}

	int peek() {
		if (q1.isEmpty()) {
			return -1;
		}
		int temp = 0;
		while (!q1.isEmpty()) {

			q2.add(temp = q1.poll());
		}
		while (!q2.isEmpty()) {
			q1.add(q2.poll());
		}

		return temp;

	}

	void push(int element) {
		q1.add(element);
	}

	int pop() {
		if (q1.isEmpty()) {
			return -1;
		}

		int size = q1.size();
		int top = 0;
		while (!q1.isEmpty()) {
			q2.add(top = q1.poll());
		}
		int i = 1;
		while (i < size) {
			q1.add(q2.poll());
			i++;
		}
		q2.remove();
		return top;
	}
}

public class Stack_using_Queues {

	public static void main(String[] args) {

		stk_usnig_que sq = new stk_usnig_que();

		// System.out.println(sq.size());
		// System.out.println(sq.isEmpty());
		// sq.push(20);
		// System.out.println(sq.size());
		// System.out.println(sq.isEmpty());
		//
		// System.out.println(sq.pop());
		// System.out.println(sq.pop());

		// System.out.println(sq.peek());
		// System.out.println(sq.size());
		// System.out.println(sq.isEmpty());
		// System.out.println(sq.peek());
//		int p = 1;
//		for (int i = 1; i <= 10; i++) {
//			sq.push(p++);
//		}
//		System.out.println("i am size " + sq.size());
//		while (!sq.isEmpty()) {
//			System.out.println(sq.pop());
//
//		}
//
		System.out.println(sq.isEmpty());
		System.out.println(sq.size());
		sq.push(20);
		System.out.println(sq.size());
		System.out.println(sq.peek());
		System.out.println(sq.size());
		sq.push(40);
		sq.push(60);
		System.out.println(sq.size());
		while (!sq.isEmpty()) {
			System.out.println(sq.pop());
		}

	}

}
