package LinkedList;

class Node<T> {
	T data;
	Node<T> next;

	Node(T data) {
		this.data = data;
	}
}

public class Create_linked_list {
	public static Node<Integer> linkedlist() {
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
//		System.out.println(n1.next.next.data);
		return n1;
	}

	public static void PrintLinkedList(Node<Integer> head) {
		Node<Integer> temp = head; // Storing the Head in temp.
		int count = 0;
		while (temp != null) {
			count = count + 1;
			System.out.print(temp.data + " ");
			temp = temp.next; // reference of next node.
		}
		System.out.println("this is the count" + count);
	}

	public static void main(String[] args) {
//		Node<Integer> n1 = new Node(10); // Its not the object , it is a reference of the Node Class .
		Node<Integer> head = linkedlist(); // storing the reference(not data) of first element;
		PrintLinkedList(head); // passing the first element reference called "head".
	}
}
