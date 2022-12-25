package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Queues_java_collection {
	public static void main(String[] args) {

		Queue<Integer> que = new LinkedList<>();
		System.out.println(que.isEmpty());
//		que.add(50);
//		System.out.println(que.isEmpty());
//		System.out.println(que.size());
//		System.out.println(que.peek());
//		System.out.println(que.poll());
//		System.out.println(que.isEmpty());

		for (int i = 1; i <= 10; i++) {
			que.add(i);
		}
		System.out.println(que.size());

		while (!que.isEmpty()) {
			System.out.print(que.poll() + " ");
		}
	}
}
