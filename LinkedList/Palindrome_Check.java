package LinkedList;

import java.util.Scanner;

class Check_P<T> {
	T data;
	Check_P<T> next;

	Check_P(T data) {
		this.data = data;
	}
}

public class Palindrome_Check {
	public static Check_P<Integer> print_reversed(Check_P<Integer> head) {
		Check_P<Integer> temp = head;
		if (temp.next == null) {
			return temp;
		}
		Check_P<Integer> small = print_reversed(head.next);
		Check_P<Integer> tail = temp.next;
		tail.next = temp;
		temp.next = null;
		return small;

	}

	public static boolean Check_P(Check_P<Integer> head) {

		Check_P<Integer> temp1 = head; // to check length of LL.
		Check_P<Integer> temp2 = head;
		Check_P<Integer> temp3 = head;
		int count = 0;
		while (temp1 != null) {
			count++;
			temp1 = temp1.next;
		}

		int mid = count / 2;
		int i = 0;
		while (i < mid) {
			temp2 = temp2.next;
			i++;
		}
		Check_P<Integer> reversed = print_reversed(temp2);
		boolean isTrue = true;
		while (mid > 0) {
			if (reversed.data != temp3.data) {
				return false;
			} else {
				isTrue = true;
			}
			mid--;
			temp3 = temp3.next;
			reversed = reversed.next;
		}
		return isTrue;

	}

	public static Check_P<Integer> create_linked() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Check_P<Integer> head = null, tail = null;
		while (data != -1) {
			Check_P<Integer> curr_node = new Check_P<Integer>(data);
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
		// TODO Auto-generated method stub
		Check_P<Integer> head = create_linked();
		boolean rr = Check_P(head);
		System.out.println(rr);

	}

}
