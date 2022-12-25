package LinkedList;

import java.util.Scanner;

class rev<T> {
	T data;
	rev<T> next;

	rev(T data) {
		this.data = data;
	}
}

public class Reverse_linked_list {
	public static void print_reversed(rev<Integer> head) {
		if (head == null) {
			return;
		}
		print_reversed(head.next);
		System.out.println(head.data);
	}

	public static rev<Integer> create_linked() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		rev<Integer> head = null, tail = null;
		while (data != -1) {
			rev<Integer> curr_node = new rev<Integer>(data);
			if (head == null) {
				head = curr_node;
				tail = curr_node;
			} else {
				tail.next = curr_node;
				tail = curr_node;
			}
			data = s.nextInt();
		}
		return head;
	}

	public static void main(String[] args) {
		rev<Integer> head = create_linked();
		print_reversed(head);
	}
}
