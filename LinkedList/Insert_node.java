package LinkedList;

import java.util.Scanner;

class in_node<T> {
	T data;
	in_node<T> next;

	in_node(T data) {
		this.data = data;
	}
}

public class Insert_node {
	public static in_node<Integer> update_node(in_node<Integer> head, int data, int at_index) {
		in_node<Integer> temp = head;
		in_node<Integer> up_node = new in_node<>(data); // the data which will insert.

		if (at_index == 0) { // Handle separately when index is 0;
			up_node.next = temp;
			return up_node; // return the updated 'head',
		}
		int curr_index = 0; // to count the index.
		while (temp != null) {
			curr_index++;
			if (curr_index == at_index) {
				up_node.next = temp.next;
				temp.next = up_node;
				break;
			}
			temp = temp.next;
		}
		return head;
	}

	public static in_node<Integer> create_node() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		in_node<Integer> head = null, tail = null;

		while (data != -1) {
			in_node<Integer> curr_node = new in_node<>(data);
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
		Scanner s = new Scanner(System.in);
		in_node<Integer> head = create_node();
		System.out.println("Enter the data you want to add");
		int data_to_add = s.nextInt();
		System.out.println("Enter the index at which to add");
		int at_index = s.nextInt();

		in_node<Integer> updeted = update_node(head, data_to_add, at_index);
		while (updeted != null) {
			System.out.println(updeted.data);
			updeted = updeted.next;
		}
	}

}
