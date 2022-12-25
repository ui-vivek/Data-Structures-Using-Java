package LinkedList;

import java.util.Scanner;

class Rev_LL<T> {
	T data;
	Rev_LL<T> next;

	Rev_LL(T data) {
		this.data = data;
	}
}

public class Reverse_LL {
	public static void print_reveresd(Rev_LL<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static Rev_LL<Integer> reverse_LL(Rev_LL<Integer> head) {
		if (head == null || head.next == null) {
			return head;
		}
		Rev_LL<Integer> small_LL = reverse_LL(head.next);
		Rev_LL<Integer> revered_tail = head.next;
		revered_tail.next = head;
		head.next = null;
		return small_LL;
	}

	public static Rev_LL<Integer> create_LL() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Rev_LL<Integer> head = null, tail = null;
		while (data != -1) {
			Rev_LL<Integer> curr_node = new Rev_LL<Integer>(data);
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
		Rev_LL<Integer> head = create_LL();
		Rev_LL<Integer> reversed_LL = reverse_LL(head);
		print_reveresd(reversed_LL);
	}

}
