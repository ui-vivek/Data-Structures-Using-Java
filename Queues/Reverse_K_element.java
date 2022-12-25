package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Reverse_K_element {
	public static Queue<Integer> rev2(Queue<Integer> que, int k) {
		if (k == 0) {
			return que;
		}
		int top = que.poll();
		que.add(top);
		rev2(que, k - 1);
		return que;
	}

	public static Queue<Integer> rev(Queue<Integer> que, int k) {

		if (k == 0) {
			return que;
		}
		int top = que.poll();
		rev(que, k - 1);
		que.add(top);
		return que;
	}

	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<>();
		for (int i = 1; i <= 50; i++) {
			que.add(i);
		}
		int k = 3;
		rev(que, k);
		rev2(que, que.size() - k);

		while (!que.isEmpty()) {
			System.out.print(que.poll() + " ");
		}

	}

}
