package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Level_wise_input {
	public static void print_tree(Tree<Integer> root) {

		Queue<Tree<Integer>> que = new LinkedList<Tree<Integer>>();
		que.add(root);
		que.add(null);
		while (!que.isEmpty()) {
			Tree<Integer> NewRoot = que.poll();
			System.out.print(NewRoot.data + " ");
			for (int i = 0; i < NewRoot.children.size(); i++) {
				que.add(NewRoot.children.get(i));
			}
			if (que.peek() == null) {
				que.poll();
				if (!que.isEmpty()) {
					que.add(null);
				} else {
					break;
				}
				System.out.println();
			}
		}
	}

	public static Tree<Integer> create_tree() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Root Data");
		int RootData = s.nextInt();
		Tree<Integer> root = new Tree<>(RootData);
		Queue<Tree<Integer>> que = new LinkedList<Tree<Integer>>();
		que.add(root);
		while (!que.isEmpty()) {
			Tree<Integer> NewRoot = que.poll();
			System.out.println("Enter the child of " + NewRoot.data);

			int childNode = s.nextInt();
			while (childNode != -1) {

				Tree<Integer> child = new Tree<>(childNode);
				NewRoot.children.add(child);
				que.add(child);
				System.out.println("Enter the child of " + NewRoot.data);
				int Node = s.nextInt();
				childNode = Node;

			}
		}

		return root;
	}

	public static void main(String[] args) {
		Tree<Integer> root = create_tree();
		print_tree(root);
	}

}
