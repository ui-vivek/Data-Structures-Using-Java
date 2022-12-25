package Binary_Tree;

import java.util.Scanner;

class userInput_bt<T> {
	T data;
	userInput_bt<T> left;
	userInput_bt<T> right;

	userInput_bt(T data) {
		this.data = data;
	}
}

public class First_User_Input_Binary_Tree {
	public static int CountNodes(userInput_bt<Integer> root) {

		if (root == null) {
			return 0;
		}
		int leftcount = CountNodes(root.left);
		int reightcount = CountNodes(root.right);
		return 1 + leftcount + reightcount;
	}

	public static void printTree(userInput_bt<Integer> root) {

		if (root == null) {
			return;
		}
		System.out.print(root.data + ":");
		if (root.left != null) {
			System.out.print("L" + root.left.data + ",");
		}
		if (root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();
		printTree(root.left);
		printTree(root.right);
	}

	public static userInput_bt<Integer> createTree() {
		Scanner s = new Scanner(System.in);
		int InputData = s.nextInt();
		if (InputData == -1) {
			return null;
		}
		userInput_bt<Integer> root = new userInput_bt<>(InputData);
		System.out.println("Enter Left Child Of " + InputData);
		userInput_bt<Integer> rootLeft = createTree();
		System.out.println("Enter Right Child Of " + InputData);
		userInput_bt<Integer> rootRight = createTree();
		root.left = rootLeft;
		root.right = rootRight;

		return root;

	}

	public static void main(String[] args) {
		System.out.println("Enter the Root ");
		userInput_bt<Integer> root = createTree();
		printTree(root);
		int NodeCount = CountNodes(root);
		System.out.println("Total Numbers Of Nodes Are :" + NodeCount);

	}

}
