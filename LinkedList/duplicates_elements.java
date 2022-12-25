package LinkedList;

import java.util.Scanner;

class dupli<T> {
	T data;
	dupli<T> next;

	dupli(T data) {
		this.data = data;
	}
}

public class duplicates_elements {
	public static void print(dupli<Integer> head) {
		dupli<Integer> temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static dupli<Integer> remove_dupli(dupli<Integer> head) {
		dupli<Integer> temp1 = head;
		while (temp1 != null) {
			dupli<Integer> temp2 = temp1.next;
			while (temp2 != null) {
				if (!temp2.data.equals(temp1.data)) { // IMP // to check the data and reference as well .
					temp1.next = temp2;
					break;
				} else {

					temp2 = temp2.next;
				}
			}
			if (temp2 == null) {
				temp1.next = null;
			}
			temp1 = temp1.next;
		}
		return head;
	}

	public static dupli<Integer> create_linked() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		dupli<Integer> head = null, tail = null;
		while (data != -1) {
			dupli<Integer> curr_node = new dupli<>(data);
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
		dupli<Integer> head = create_linked();
//		remove_dupli(head);
		dupli<Integer> removed_dupli = remove_dupli(head);
		print(removed_dupli);

	}

}
