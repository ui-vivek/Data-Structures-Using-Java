package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Reverse_Queue {
	public static Queue<Integer> rev(Queue<Integer> que) {

		if (que.isEmpty()) {
			return que;
		}
		int top = que.poll();
		rev(que);
		que.add(top);
		return que;
	}

	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<>();
		for (int i = 1; i <= 5; i++) {
			que.add(i);
		}

		 rev(que);

		while (!que.isEmpty()) {
			System.out.println(que.poll());
		}

	}

}
