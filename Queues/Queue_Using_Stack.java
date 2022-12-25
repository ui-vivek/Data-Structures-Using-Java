package Queues;

import java.util.Stack;

class Que_stk_cls<T> {
	Stack<T> s1;
	Stack<T> s2;

	Que_stk_cls() {
		s1 = new Stack<>();
		s2 = new Stack<>();
	}

	int size() {
		return s1.size();
	}

	boolean isEmpty() {
		if (s1.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	T front() {

		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		T temp = s2.peek();
		while (!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		return temp;
	}

	void enqueues(T element) {

		s1.push(element);

	}

	T dequeues() {

		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		T temp = s2.pop();
		while (!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		return temp;
	}

}

public class Queue_Using_Stack {

	public static void main(String[] args) {

		Que_stk_cls<Integer> sq = new Que_stk_cls<>();

		System.out.println(sq.isEmpty());
		System.out.println(sq.size());
		sq.enqueues(50);
		sq.enqueues(60);
		sq.enqueues(70);
		sq.enqueues(80);
		System.out.println(sq.isEmpty());
		System.out.println(sq.size());

		while (!sq.isEmpty()) {
			System.out.println(sq.dequeues());
		}
		System.out.println(sq.isEmpty());

	}

}
