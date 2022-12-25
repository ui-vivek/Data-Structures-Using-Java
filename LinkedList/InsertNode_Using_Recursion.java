package LinkedList;

import java.util.Scanner;

class InsertUsingRecursion<T> {
	T data;
	InsertUsingRecursion<T> next;

	InsertUsingRecursion(T data) {
		this.data = data;
	}
}

public class InsertNode_Using_Recursion {
	public static void print_LL(InsertUsingRecursion<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static InsertUsingRecursion<Integer> insert_LL(InsertUsingRecursion<Integer> head, int data, int index) {
		InsertUsingRecursion<Integer> temp = head;
		InsertUsingRecursion<Integer> update = new InsertUsingRecursion<>(data);
		if (temp == null && index > 0) {
			return head;
		}
		if (index == 0) {
			update.next = head;
			head = update;
			return head;
		}
//		InsertUsingRecursion<Integer> updated_LL = insert_LL(temp.next, data, index - 1);
//		head.next = updated_LL;
		head.next = insert_LL(temp.next, data, index - 1); // same as the above line .
		return head;
	}

	public static InsertUsingRecursion<Integer> create_LL() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		InsertUsingRecursion<Integer> head = null, tail = null;
		while (data != -1) {
			InsertUsingRecursion<Integer> curr_node = new InsertUsingRecursion<>(data);
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
		InsertUsingRecursion<Integer> head = create_LL();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the data to insert");
		int data = s.nextInt();
		System.out.println("Enter the index at which to insert");
		int index = s.nextInt();
		InsertUsingRecursion<Integer> inserted = insert_LL(head, data, index);
		print_LL(inserted);
	}

}
