package Queues;

//---------------------------- Linked-List class.
class que_LL<T> {
	T data;
	que_LL<T> next;

	que_LL(T data) {
		this.data = data;
	}
}

//---------------------------- Queues class.
class Queues_LL_cls<T> {
	private que_LL<T> front;
	private que_LL<T> rear;
	int size;

	Queues_LL_cls() {
		front = null;
		rear = null;
		size = 0;

	}

	boolean isEmpty() {
		if (front == null) {
			return true;
		} else {
			return false;
		}
	}

	int size() {
		return size;
	}

	T front() throws QueuesEmpty_Expception {
		if (front == null) {
			throw new QueuesEmpty_Expception();
		}
		return front.data;
	}

	void enqueues(T elemenet) {
		que_LL<T> data = new que_LL<>(elemenet);
		if (front == null) {
			front = data;
			rear = data;
		} else {
			rear.next = data;
			rear = data;
		}
		size++;
	}

	T dequeues() throws QueuesEmpty_Expception {

		if (front == null) {
			rear = null;
			throw new QueuesEmpty_Expception();
		}
		T temp = front.data;
		size--;
		front = front.next;
		return temp;
	}

}

class QueuesEmpty_Expception extends Exception { // For exception handling
}

class QueuesFull_Expception extends Exception { // For exception handling
}

public class Queues_Using_LL {

	public static void main(String[] args) throws QueuesFull_Expception, QueuesEmpty_Expception {

		Queues_LL_cls<Integer> que = new Queues_LL_cls<>();
		System.out.println(que.isEmpty());

		for (int i = 1; i <= 5; i++) {
			que.enqueues(i);
		}

		System.out.println(que.size);
		System.out.println(que.front());
		System.out.println(que.isEmpty());
		System.out.println(que.dequeues());
		System.out.println(que.dequeues());
		System.out.println(que.dequeues());
		System.out.println(que.dequeues());
		System.out.println(que.dequeues());

	}

}
