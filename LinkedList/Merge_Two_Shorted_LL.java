package LinkedList;

import java.util.Scanner;

class MS<T> {
	T data;
	MS<T> next;

	MS(T data) {
		this.data = data;
	}
}

public class Merge_Two_Shorted_LL {
	public static void print(MS<Integer> head) {
		System.out.println("Sorted Linked List is : ");
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static MS<Integer> merge(MS<Integer> head1, MS<Integer> head2) {
		if (head1 == null) {
			return head2;
		}
		if (head2 == null) {
			return head1;
		}
		MS<Integer> head = null, tail = null;
		MS<Integer> t1 = head1, t2 = head2;
		if (t1.data <= t2.data) {
			head = t1;
			tail = t1;
			t1 = t1.next;
		} else {
			head = t2;
			tail = t2;
			t2 = t2.next;
		}
		while (t1 != null && t2 != null) {
			if (t1.data <= t2.data) {
				tail.next = t1;
				tail = t1;
				t1 = t1.next;
			} else {
				tail.next = t2;
				tail = t2;
				t2 = t2.next;
			}
		}
		if (t1 != null) {
			tail.next = t1;
		} else {
			tail.next = t2;
		}
		return head;
	}

	public static MS<Integer> LL_2() {
		System.out.println("Enter The Second Sorted Linked List");

		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		MS<Integer> head = null, tail = null;
		while (data != -1) {
			MS<Integer> curr_node = new MS<Integer>(data);
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

	public static MS<Integer> LL_1() {
		System.out.println("Enter The First Sorted Linked List");
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		MS<Integer> head = null, tail = null;
		while (data != -1) {
			MS<Integer> curr_node = new MS<Integer>(data);
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
		MS<Integer> head1 = LL_1();
		MS<Integer> head2 = LL_2();
		MS<Integer> merged = merge(head1, head2);
		print(merged);

	}

}
