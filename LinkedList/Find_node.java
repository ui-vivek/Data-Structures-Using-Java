package LinkedList;

import java.util.Scanner;

class find_n<T> {
	T data;
	find_n<T> next;

	find_n(T data) {
		this.data = data;
	}
}

public class Find_node {
	public static int find_index(find_n<Integer> head, int element) {
		find_n<Integer> temp = head;
		int count = 0;
		while (temp != null) {
			if (temp.data == element) {
				return count;
			}
			temp = temp.next;
			count++;
		}
		return -1;
	}

	public static find_n<Integer> create_LL() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		find_n<Integer> head = null, tail = null;
		while (data != -1) {
			find_n<Integer> curr_node = new find_n<>(data);
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
		System.out.println("Enter The Elemets In Linked List");
		find_n<Integer> head = create_LL();
		int result = find_index(head, 4);
		System.out.println("The Element Is Present At " + result);
	}

}
