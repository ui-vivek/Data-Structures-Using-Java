package LinkedList;

import java.util.Scanner;

class linked<T> {
	T data;
	linked<T> next;

	linked(T data) {
		this.data = data;
	}
}

public class LL_User_Input {
	public static void print_linked(linked<Integer> head) {
		linked<Integer> temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static linked<Integer> create_linked() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		linked<Integer> head = null, tail = null;
		while (data != -1) {
			linked<Integer> current_node = new linked<>(data);
			if (head == null) { // it will work only once.
				head = current_node;
				tail = current_node;
			} else {
//				linked<Integer> tail = head;
//				while (tail.next != null) {
//					tail = tail.next;
//				}
//				tail.next = current_node;

				tail.next = current_node;
				tail = current_node;
			}
			data = s.nextInt();
		}
		return head;
	}

	public static void main(String[] args) {

		linked<Integer> head = create_linked();
		print_linked(head);

	}

}
