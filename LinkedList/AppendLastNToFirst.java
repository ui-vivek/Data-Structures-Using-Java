package LinkedList;

import java.util.Scanner;

class Append<T> {
	T data;
	Append<T> next;

	Append(T data) {
		this.data = data;
	}
}

public class AppendLastNToFirst {
	public static void print(Append<Integer> head) {
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

	public static Append<Integer> AppendLastNToFirst_c(Append<Integer> head, int index) {
		Append<Integer> len = head; // to count the length
		Append<Integer> temp = head;
		Append<Integer> demo = head;

		int count = 0;
		while (len != null) {
			len = len.next;
			count++;
		}
		int i = 0;
		while (i < count - index - 1) {
			temp = temp.next;
			i++;
		}
		head = temp.next;
		temp.next = null;
		Append<Integer> end_head = head;
		while (end_head.next != null) {
			end_head = end_head.next;
		}
		end_head.next = demo;

		return head;
	}

	public static Append<Integer> create_linked() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Append<Integer> head = null, tail = null;
		while (data != -1) {
			Append<Integer> curr_node = new Append<>(data);
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
		Append<Integer> head = create_linked();
		Append<Integer> new_head = AppendLastNToFirst_c(head, 2);
		print(new_head);

	}

}
