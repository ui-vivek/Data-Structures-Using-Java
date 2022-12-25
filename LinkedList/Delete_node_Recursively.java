package LinkedList;

import java.util.Scanner;

class D_N_R<T> {
	T data;
	D_N_R<T> next;

	D_N_R(T data) {
		this.data = data;
	}
}

public class Delete_node_Recursively {
	public static void print_LL(D_N_R<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static D_N_R<Integer> update_LL(D_N_R<Integer> head, int index) {
		D_N_R<Integer> temp = head;

		if (head == null) {
			return head;
		}
		if (index == 0) {
			temp = temp.next;
			return temp;
		}
		D_N_R<Integer> curr_node = update_LL(temp.next, index - 1);
		temp.next = curr_node;
		return temp;

	}

	public static D_N_R<Integer> create_LL() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		D_N_R<Integer> head = null, tail = null;
		while (data != -1) {
			D_N_R<Integer> curr_node = new D_N_R<>(data);
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
		D_N_R<Integer> head = create_LL();
		System.out.println("Enter The Index To Delete");
		int index = s.nextInt();
		D_N_R<Integer> updated_LL = update_LL(head, index);
		print_LL(updated_LL);
	}

}
