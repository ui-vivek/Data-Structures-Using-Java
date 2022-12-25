package Queues;

class F_Queues {
	private int data[];
	private int front;
	private int rear;
	private int size;

	F_Queues() { // default constructor .
		data = new int[5];
		size = 0;
		rear = -1;
	}

	F_Queues(int capacity) { // user define constructor .
		data = new int[capacity];
		size = -1;
		rear = -1;
	}

	void enqueues(int element) throws QueuesFullExpception {
		if (size == data.length) {
			throw new QueuesFullExpception();
		}
		if (size == 0) {
			front = 0; // to increase the front for the first time of insertion.
		}
		rear++;
		if (rear == data.length) {
			rear = 0;
		}
		data[rear] = element;
		size++;
	}

	int dequeues() throws QueuesEmptyExpception {
		if (size == 0) {
			throw new QueuesEmptyExpception();
		}
		int temp = data[front];
		front++;
		if (front == data.length) {
			front = 0;
		}
		size--;
		return temp;
	}

	int front() throws QueuesEmptyExpception {
		if (size == 0) {
			throw new QueuesEmptyExpception();
		}
		return data[front];
	}

	int rear() throws QueuesEmptyExpception {
		if (size == 0) {
			throw new QueuesEmptyExpception();
		}
		return data[rear];
	}

	boolean isEmpty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	int size() {
		return size;
	}
}

class QueuesEmptyExpception extends Exception { // For exception handling
}

class QueuesFullExpception extends Exception { // For exception handling
}

public class First_Queues_Program {

	public static void main(String[] args) throws QueuesFullExpception, QueuesEmptyExpception {

		F_Queues que = new F_Queues();

		int arr[] = { 10, 20, 30, 40, 50 };

		for (int elem : arr) {
			que.enqueues(elem);
		}

		que.dequeues();
		que.enqueues(60);

		while (!que.isEmpty()) {
			System.out.println(que.dequeues());
		}

	}

}
