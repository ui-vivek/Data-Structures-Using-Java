package LinkedList;

import java.util.Scanner;

class de_node<T> {
	T data;
	de_node<T> next;

	de_node(T data) {
		this.data = data;
	}
}

public class Delete_node {
	public static void print_linked(de_node<Integer> head) {
		de_node<Integer> temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static de_node<Integer> delete_node(de_node<Integer> head, int index) {
		if (head == null) {
			return head;
		}
		de_node<Integer> temp = head;
		int count = 0;
		if (index == 0) {
			System.out.println(temp.data + " is deleted form the index " + index);
			temp = temp.next;
			return temp;
		}
		while (temp.next != null) {

			if (count == (index - 1)) {
				System.out.println(temp.next.data + " is deleted from index " + index);
				temp.next = temp.next.next;
			} else {

				temp = temp.next;
			}
			count++;
		}
		return head;
	}

	public static de_node<Integer> create_linked() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		de_node<Integer> head = null, tail = null;
		while (data != -1) {
			de_node<Integer> curr_node = new de_node<>(data);
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
		System.out.println("Enter the nodes : ");
		de_node<Integer> head = create_linked();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Index to delete the value of that indx");
		int index = s.nextInt();
		de_node<Integer> up_date = delete_node(head, index);
		print_linked(up_date);

	}

}
